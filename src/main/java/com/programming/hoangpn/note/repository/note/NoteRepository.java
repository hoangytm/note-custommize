package com.programming.hoangpn.note.repository.note;

import com.programming.hoangpn.note.model.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author PhanHoang
 * 10/26/2020
 */
public interface NoteRepository extends JpaRepository<Note, String> {
}
