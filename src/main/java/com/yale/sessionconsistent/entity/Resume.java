package com.yale.sessionconsistent.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_resume")
public class Resume {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "mobile")
    private String mobile;
}

