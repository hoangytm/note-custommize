package com.programming.hoangpn.note.service.Note;

import com.programming.hoangpn.note.exceptions.BusinessException;
import com.programming.hoangpn.note.model.note.Note;
import com.programming.hoangpn.note.repository.note.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PhanHoang
 * 10/26/2020
 */
@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> search(Note note) {
        List<Note> notes;
        try {
            notes = noteRepository.search(note);
        } catch (Exception ex) {
            throw new BusinessException(ex.getMessage());
        }
        return notes;
    }

    public Note create(Note note) {
        return noteRepository.save(note);
    }

    public void delete(String id) {
        noteRepository.delete(noteRepository.findById(id).orElse(null));
    }
}
