package org.example.exception;

public class InstructorNotFoundException extends RuntimeException {

    private String meggage;

    public InstructorNotFoundException(String message) {

        this.meggage = meggage;
    }

    public String getMeggage() {
        return meggage;
    }


}
