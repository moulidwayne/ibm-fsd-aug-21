package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
@Data
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private Integer id;
   @NotBlank(message="is required")
   @Column(name="first_name")
   private String firstName;
   @NotBlank(message="is required")
   @Column(name="last_name")
   private String lastName;
   @NotBlank(message="is required")
   private String email;
}
