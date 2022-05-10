package com.bassem.moviecatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

@Document(value = "users")
public class User {

    @Id
    public String id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format( "email='%s', password='%s'", email, password );
    }

}