package com.hassan.gratitude.journal.gratitudejournal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.GratitudeNote;
import com.hassan.gratitude.journal.gratitudejournal.data.repository.GratitudeNoteRepository;

@Controller
@RequestMapping
public class GratituteNoteController {
    @Autowired
    private com.hassan.gratitude.journal.gratitudejournal.data.repository.GratitudeNoteRepository gratitudeNoteRepository;

    //add service only when from controller need to mix domains and add unit test for service directly
    @GetMapping("/gratitudes")
    public String getGratitudeNotes(Model model){
        model.addAttribute("gratitudeNotes",gratitudeNoteRepository.findGratitudeNoteByUserId(0L));
        return "gratitudes";
    }

    @GetMapping(value = "/gratitudesbyuserid")
    public String getGratitudeNotesByUserId(@RequestParam(value = "id", required = false) Long userID,
        Model model){
        model.addAttribute("gratitudeNotes",gratitudeNoteRepository.findGratitudeNoteByUserId(userID));
        http://localhost:8080/gratitudesbyuserid?id=0
        return "gratitudes";
    }



}
