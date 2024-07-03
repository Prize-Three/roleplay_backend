package com.prizethree.roleplay.entity;

import jakarta.persistence.*;


@Entity
public class Voice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "voice_name", nullable = false, length = 50)
    private String voiceName;

}
