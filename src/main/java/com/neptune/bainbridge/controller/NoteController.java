package com.neptune.bainbridge.controller;

import com.neptune.bainbridge.request.CreateNoteRequest;
import com.neptune.bainbridge.response.NoteResponse;
import com.neptune.bainbridge.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1")
public class NoteController {

    @Autowired
    INoteService noteService;

    @PostMapping("note")
    public String createNote(@RequestBody CreateNoteRequest createNoteRequest) {
        noteService.saveNote(createNoteRequest);
        return "Note Created Successfully.";
    }

    @GetMapping
    public List<NoteResponse> getAllNotes() {
        return noteService.getAllNotes();
    }
}
