package com.prizethree.roleplay.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.*;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "join_date", nullable = false)
    private LocalDateTime joinDate;

    @Column(name = "play_time")
    private Double playTime;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Voice> voices;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<History> histories;

}
