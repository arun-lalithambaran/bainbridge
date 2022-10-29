package com.neptune.bainbridge;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "note")
@Getter
@Setter
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noteId", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "note", nullable = false)
    private String noteText;

    @Column(name = "status", nullable = false)
    private int status;

}