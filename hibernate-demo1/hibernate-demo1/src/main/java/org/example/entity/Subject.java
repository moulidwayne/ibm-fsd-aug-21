package org.example.entity;

public enum Subject {

    SPRING("Spring"),
    ANGULAR("Angular"),
    NODE("Node"),
    JAVA("Java");
    private String message;

    Subject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
