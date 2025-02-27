package com.example.CheckerServer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") 
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;  

    @Column(nullable = false, unique = true) 
    private String email;  

    @Column(nullable = false) 
    private String password;  

    @Column(nullable = false) 
    private String name;  

    @Column(nullable = false) 
    private int birthyear;   

    @Column(nullable = true, length = 10000)
    private String profilePicture;
    
    public Long getId() {
        return id;  
    }

    public void setId(Long id) {
        this.id = id;  
    }

    public String getEmail() {
        return email;  
    }

    public void setEmail(String email) {
        this.email = email;  
    }

    public String getPassword() {
        return password;  
    }

    public void setPassword(String password) {
        this.password = password;  
    }

    public String getName() {
        return name;  
    }

    public void setName(String name) {
        this.name = name;  
    }

    public int getBirthyear() {
        return birthyear;  
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;  
    }

    public String getProfilePicture() { 
        return profilePicture; 
    }

    public void setProfilePicture(String profilePicture) { 
        this.profilePicture = profilePicture; 
    }
}
