package com.programming.hoangpn.note.repository.note;

import com.programming.hoangpn.note.exceptions.BusinessException;
import com.programming.hoangpn.note.model.note.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author PhanHoang
 * 10/26/2020
 */
@Slf4j
@Repository
public class NoteRepositoryImpl implements NoteRepositoryCustom {
    @Autowired
    private NoteRepository noteRepository;
    @PersistenceContext
    private EntityManager em;

    public List<Note> search(Note note) {
        List<Note> notes = null;
        Map<String, java.io.Serializable> mapParams = new HashMap<>();
        try {
            String sql = "select n from Note n where 1=1 ";
            if (note.getId() != null) {
                sql = sql + " and n.id=:id ";
                mapParams.put("id", note.getId());
            }
            if (note.getNoteName() != null) {
                sql = sql + " and n.noteName=:noteName ";
                mapParams.put("noteName", note.getNoteName());
            }
            if (note.getDateCreate() != null) {
                sql = sql + " and n.dateCreate=:dateCreate ";
                mapParams.put("dateCreate", note.getDateCreate());
            }
            if (note.getUserName() != null) {
                sql = sql + " and n.userName=:userName ";
                mapParams.put("userName", note.getUserName());
            }
            if (note.getUserName() != null) {
                sql = sql + " and n.userName=:userName ";
                mapParams.put("userName", note.getUserName());
            }
            if (note.getUserId() != null) {
                sql = sql + " and n.userId=:userId ";
                mapParams.put("userId", note.getUserId());
            }
            log.info("H - sql: " + sql);
            Query query = em.createQuery(sql);
            mapParams.forEach(query::setParameter);
            notes = query.getResultList();
        } catch (Exception ex) {
            throw new BusinessException(ex.getMessage());
        }
        return notes;
    }
}
