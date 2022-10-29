package com.neptune.bainbridge.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoteResponse {
    private Integer noteId;
    private String noteText;
}
