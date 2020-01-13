package com.hassan.gratitude.journal.gratitudejournal.data.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.GratitudeNote;

@Repository
public interface GratitudeNoteRepository extends CrudRepository<GratitudeNote, Long> {
    public Iterable<GratitudeNote> findGratitudeNoteByUserId(Long userId);
}




