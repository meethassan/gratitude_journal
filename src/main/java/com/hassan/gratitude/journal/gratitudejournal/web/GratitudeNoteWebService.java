package com.hassan.gratitude.journal.gratitudejournal.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.GratitudeNote;
import com.hassan.gratitude.journal.gratitudejournal.data.repository.GratitudeNoteRepository;

@RestController
@RequestMapping(value = "api/gratitudenoteservice")
public class GratitudeNoteWebService {
    @Autowired
    public final GratitudeNoteRepository gratitudeNoteRepository;

    @Autowired
    public GratitudeNoteWebService(GratitudeNoteRepository gratitudeNoteRepository) {
        this.gratitudeNoteRepository = gratitudeNoteRepository;
    }

    @GetMapping
    public List<GratitudeNote> getGratitudeNotesByUserId(){
        return gratitudeNoteRepository.findGratitudeNoteByUserId(0L);
    }
}
