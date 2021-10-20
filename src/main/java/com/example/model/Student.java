package com.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Setter
@Getter
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
}
