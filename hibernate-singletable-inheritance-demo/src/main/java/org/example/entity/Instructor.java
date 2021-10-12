package org.example.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue(value = "INSTRUCTOR")
public class Instructor extends UserEntity {
    @Column(name = "INSTRUCTOR_SALARY")
    private Double salary;
}
