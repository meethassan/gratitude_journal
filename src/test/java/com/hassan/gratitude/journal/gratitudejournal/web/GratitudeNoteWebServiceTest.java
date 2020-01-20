package com.hassan.gratitude.journal.gratitudejournal.web;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.ui.Model;

import com.hassan.gratitude.journal.gratitudejournal.data.entity.GratitudeNote;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@RestClientTest(GratitudeNoteWebService.class)
public class GratitudeNoteWebServiceTest {
    @MockBean
    private GratitudeNoteWebService gratitudeNoteWebService;

//    @Autowired MockReset mockMvc;
//
//
//    @Test
//    public void getGratitudeNotesByUserId() throws Exception {
//        ArrayList<GratitudeNote> gratitudeNotes = new ArrayList<GratitudeNote>();
//        GratitudeNote gratitudeNote = new GratitudeNote();
//        gratitudeNote.setGratefulFor("Being healthy");
//        gratitudeNote.setId(0);
//        gratitudeNote.setTimestamp(new Timestamp(System.currentTimeMillis()));
//        gratitudeNote.setUserId(0l);
//        gratitudeNotes.add(gratitudeNote);
//
//        given(gratitudeNoteWebService.getGratitudeNotesByUserId())
//            .willReturn(gratitudeNotes);
//
//        this.mockMvc.perform(MockMvcRequestBuilders.get("gratitudenoteswebsergice/"))
//        .andExpect(status().isOk())
//        .andExpect(content().string(containsString("healthy")));
//    }
}
