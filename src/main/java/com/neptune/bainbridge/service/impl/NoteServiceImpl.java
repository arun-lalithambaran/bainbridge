package com.neptune.bainbridge.service.impl;

import com.neptune.bainbridge.Note;
import com.neptune.bainbridge.converter.NoteResponseConverter;
import com.neptune.bainbridge.repository.NoteRepository;
import com.neptune.bainbridge.request.CreateNoteRequest;
import com.neptune.bainbridge.response.NoteResponse;
import com.neptune.bainbridge.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements INoteService {
    @Autowired
    NoteRepository noteRepository;
    @Autowired
    NoteResponseConverter noteResponseConverter;

    @Override
    public void saveNote(CreateNoteRequest noteRequest) {
        Note note = new Note();
        note.setNoteText(noteRequest.getNoteText());
        note.setStatus(1);
        noteRepository.save(note);
    }

    @Override
    public List<NoteResponse> getAllNotes() {
        List<Note> notes = noteRepository.findAll();
        return noteResponseConverter.convert(notes);
    }

}
