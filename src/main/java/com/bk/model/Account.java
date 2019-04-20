package com.bk.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document
public class Account {

    @Id
    String id;

    String username;

    String password;

    String firstName;

    String lastName;

    Instant dob;
}
