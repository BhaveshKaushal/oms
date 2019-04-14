package com.ved.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.Instant;

@Data
public class Account {

    @Id
    String id;

    String username;

    String password;

    String firstName;

    String lastName;

    Instant dob;
}
