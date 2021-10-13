package org.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "special_edition_cd_table")
public class SpecialEditionCD extends CD{
    @Column(name = "special_feature")
    private String specialFeature;
}
