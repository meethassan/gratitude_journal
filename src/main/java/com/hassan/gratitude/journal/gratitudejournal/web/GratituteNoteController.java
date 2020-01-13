package com.hassan.gratitude.journal.gratitudejournal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.GratitudeNote;
import com.hassan.gratitude.journal.gratitudejournal.data.repository.GratitudeNoteRepository;

@RestController
@RequestMapping("/gratitudes")
public class GratituteNoteController {
    @Autowired
    private com.hassan.gratitude.journal.gratitudejournal.data.repository.GratitudeNoteRepository gratitudeNoteRepository;


    @GetMapping
    public Iterable<GratitudeNote> getGratitudeNotes(){
        return this.gratitudeNoteRepository.findAll();
    }

    @GetMapping("user")
    public String getGratitudeNotesByUsers(@RequestParam(value = "id", required = true) Long userID,
        Model model){
        model.addAttribute(gratitudeNoteRepository.findGratitudeNoteByUserId(userID));
        return "gratitudes";
    }



}
