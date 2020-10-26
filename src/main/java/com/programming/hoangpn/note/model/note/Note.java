package com.programming.hoangpn.note.model.note;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;


/**
 * @author PhanHoang
 * 10/26/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "NOTE")
public class Note {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", nullable = false, length = 100)
    private String id;

    @Column(name = "NOTE_NAME")
    private String noteName;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DATE_CREATE")
    private Date dateCreate;

    @Column(name = "STATUS")
    private Long status;
}
