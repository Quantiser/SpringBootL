package com.personal.leaning.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    public ErrorMessage(HttpStatus httpStatus, String status) {
        this.httpStatus = httpStatus;
        this.status = status;
    }

    public ErrorMessage() {
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private HttpStatus httpStatus;
    private String status;


}
