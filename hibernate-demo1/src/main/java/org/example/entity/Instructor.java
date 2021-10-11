package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instructorId;
    private String id;
    @Column(name = "instructor_name")
    private String instructorName;
    @Column(name = "subject_name")
    @Enumerated(EnumType.STRING)
    private Subject subject;

}
