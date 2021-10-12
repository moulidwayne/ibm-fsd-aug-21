package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(value = "STUDENT")
public class Student extends UserEntity {
    @Column(name = "course_name")
    private String course;

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "course='" + course + '\'' +
                '}';
    }
}
