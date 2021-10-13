package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "international_cd_table")
public class InternationalCD extends CD{
    @Column(name = "cd_laguage")
    private String language;

    @Override
    public String toString() {
        return super.toString()+"language: " + language;

    }
}
