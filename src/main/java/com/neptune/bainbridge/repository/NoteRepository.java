package com.neptune.bainbridge.repository;

import com.neptune.bainbridge.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
