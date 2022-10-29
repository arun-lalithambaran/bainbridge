package com.neptune.bainbridge.converter;

import com.neptune.bainbridge.Note;
import com.neptune.bainbridge.response.NoteResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoteResponseConverter {
    public List<NoteResponse> convert(List<Note> notes) {
        return notes.stream().map(this::convert).toList();
    }

    public NoteResponse convert(Note note) {
        return NoteResponse.builder().noteId(note.getId()).noteText(note.getNoteText()).build();
    }

}
