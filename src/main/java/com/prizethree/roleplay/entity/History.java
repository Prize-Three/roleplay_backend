package com.prizethree.roleplay.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "voice_id")
    private Voice voice;

    @Column(name = "situation", length = 100)
    private String situation;

    @Column(name = "duration")
    private LocalDateTime duration;

    @Column(name = "date")
    private Date date;

    @Column(name = "my_role", length = 100)
    private String myRole;

    @Column(name = "ai_role", length = 100)
    private String aiRole;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tag> tags;

}
