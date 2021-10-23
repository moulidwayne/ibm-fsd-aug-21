package com.example.demo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
