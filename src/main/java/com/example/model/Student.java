package com.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Setter
@Getter
public class Student {
    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String firstName;
    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;
    @NotNull(message = "is required")

    private String email;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
}
