package com.example.sitraexampleproj.demo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;
@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long phoneNumber;
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;
    private Long alterPhoneNumber;

    public user(){
    }

    public user(String firstName, String lastName,String email,String password,Long phoneNumber,Long alterPhoneNumber,Date dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.alterPhoneNumber = alterPhoneNumber;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getAlterPhoneNumber() {
        return alterPhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setAlterPhoneNumber(Long alterPhoneNumber) {
        this.alterPhoneNumber = alterPhoneNumber;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  this.id.toString() + ":" + this.firstName + " " + this.lastName;
    }
}
