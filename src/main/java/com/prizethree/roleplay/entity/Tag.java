package com.prizethree.roleplay.entity;

import jakarta.persistence.*;
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "history_id", nullable = false)
    private History history;

    @Column(name = "tag", nullable = false, length = 100)
    private String tag;

}
