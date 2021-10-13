package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "USER_TYPE",discriminatorType = DiscriminatorType.STRING)
//@NoArgsConstructor
//@AllArgsConstructor
@Data
//@DiscriminatorValue(value = "NORMAL_USER")
public abstract class UserEntity {
   @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

 @Override
 public String toString() {
  return "UserEntity{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", email='" + email + '\'' +
          '}';
 }
}
