# Spring Boot Application with Signature Issuing Controller

This application has a REST controller `MainController` with the POST `issueSignature()` method 
that accepts an `operationId` as part of the URL 
and request params from a POST request coming from some HTML form. 
It returns a JSON object with a status and signature value, which is a Hmac SHA256 hash of the form parameters 
sorted by their names and signed with a secret.
If request parameters are empty it returns 400 HTTP code.

Also, all controller's methods are preprocessed for the checking the existence and validity of `Token`
header in the requests. If this header is missing or has a different value, it returns a 403 HTTP code.