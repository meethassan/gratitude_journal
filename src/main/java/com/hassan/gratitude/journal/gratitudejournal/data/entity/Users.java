package com.hassan.gratitude.journal.gratitudejournal.data.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "username")
    String username;
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name="created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp createdAt;
}
