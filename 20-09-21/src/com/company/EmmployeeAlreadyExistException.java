package com.company;

public class EmmployeeAlreadyExistException extends Exception {

    private String message;

    public EmmployeeAlreadyExistException(String duplicate_employee) {
        this.message=duplicate_employee;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
