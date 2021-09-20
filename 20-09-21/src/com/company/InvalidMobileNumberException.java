package com.company;

public class InvalidMobileNumberException extends Exception {
    private String message;

    public InvalidMobileNumberException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
