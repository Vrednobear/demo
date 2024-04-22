package com.example.demo.security;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TokenFilter implements Filter {

    @Value("${token.header}")
    String tokenHeader;

    @Value("${token.value}")
    String tokenValue;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException
    {
        String token = ((HttpServletRequest)servletRequest).getHeader(tokenHeader);

        if (token != null && token.equals(tokenValue))
            filterChain.doFilter(servletRequest, servletResponse);
        else
            ((HttpServletResponse) servletResponse).setStatus(HttpServletResponse.SC_FORBIDDEN);
    }
}
