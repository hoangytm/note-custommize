package com.programming.hoangpn.note.repository.note;

import com.programming.hoangpn.note.model.note.Note;

import java.util.List;

/**
 * @author PhanHoang
 * 10/26/2020
 */
public interface NoteRepositoryCustom{
    List<Note> search(Note note);
}
