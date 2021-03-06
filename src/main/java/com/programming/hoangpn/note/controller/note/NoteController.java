package com.programming.hoangpn.note.controller.note;

import com.programming.hoangpn.note.model.ApiResponse;
import com.programming.hoangpn.note.model.note.Note;
import com.programming.hoangpn.note.service.Note.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author PhanHoang
 * 10/26/2020
 */
@RestController
@RequestMapping("note")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping("/search")
    public ApiResponse search(Note note) {
        List<Note> notes = noteService.search(note);
        return ApiResponse.builder()
                .code(200)
                .message("success")
                .data(notes)
                .build();
    }

    @PostMapping
    public ApiResponse creeate(@RequestBody Note note) {
        Note notes = noteService.create(note);
        return ApiResponse.builder()
                .code(200)
                .message("success")
                .data(notes)
                .build();
    }

    @DeleteMapping
    public ApiResponse creeate(@RequestBody String id) {
        noteService.delete(id);
        return ApiResponse.builder()
                .code(200)
                .message("success")
                .data(id)
                .build();
    }
}
