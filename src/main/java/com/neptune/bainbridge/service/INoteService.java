package com.neptune.bainbridge.service;

import com.neptune.bainbridge.request.CreateNoteRequest;
import com.neptune.bainbridge.response.NoteResponse;

import java.util.List;

public interface INoteService {
    void saveNote(CreateNoteRequest noteRequest);

    List<NoteResponse> getAllNotes();
}
