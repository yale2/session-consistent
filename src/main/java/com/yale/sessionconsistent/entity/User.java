package com.yale.sessionconsistent.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yale
 */
@Data
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
}
