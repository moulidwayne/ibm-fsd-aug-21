package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="zipcode")
    private String zipcode;
}
