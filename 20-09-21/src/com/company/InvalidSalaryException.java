package com.company;

public class InvalidSalaryException extends Exception {

    private String message;

    public InvalidSalaryException(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"    "+message;
    }
}
