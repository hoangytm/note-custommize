package com.programming.hoangpn.note.service.Note;

import com.programming.hoangpn.note.exceptions.BusinessException;
import com.programming.hoangpn.note.model.note.Note;
import com.programming.hoangpn.note.repository.note.NoteRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PhanHoang
 * 10/26/2020
 */
@Service
public class NoteService {
    @Autowired
    private NoteRepositoryCustom noteRepository;

    public List<Note> search(Note note) {
        List<Note> notes = new ArrayList<>();
        try {
            notes = noteRepository.search(note);

        } catch (Exception ex) {
            throw new BusinessException(ex.getMessage());
        }
        return notes;
    }
}
