package com.hassan.gratitude.journal.gratitudejournal.data.entity;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "gratitude_journal")
public class GratitudeNote {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getGratefulFor() {
        return gratefulFor;
    }

    public void setGratefulFor(String gratefulFor) {
        this.gratefulFor = gratefulFor;
    }

    @Column(name = "grateful_for")
    private String gratefulFor;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Column(name = "created_at")
    private Timestamp timestamp;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "user_id")
    private Long userId;
}
