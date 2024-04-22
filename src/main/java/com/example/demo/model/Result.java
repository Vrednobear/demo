package com.example.demo.model;

import java.util.List;

public class Result {
    private String status;
    private List<Signature> result;

    public Result(String status, List<Signature> result) {
        this.status = status;
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Signature> getResult() {
        return result;
    }

    public void setResult(List<Signature> result) {
        this.result = result;
    }
}
