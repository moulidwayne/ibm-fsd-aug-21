package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private Integer id;
   private String firstName;
   private String lastName;
   private String email;
}
