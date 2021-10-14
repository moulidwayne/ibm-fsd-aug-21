package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getDetails()
    {
        return "First Name: "+firstName+" Last Name: "+lastName+" Email: "+email;
    }
}
