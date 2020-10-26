package com.programming.hoangpn.note.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author PhanHoang
 * 9/16/2020
 */
@Entity
@Table(name = "USER_TOKEN")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserToken {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", nullable = false, length = 100)
    private String id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "TOKEN", length = 300)
    private String toKen;

    @Column(name = "CREATE_DATE")
    private Date createTime;

    @Column(name = "IP")
    private String ip;

    @Column(name = "DEVICE")
    private String device;

    @Column(name = "BROWSER")
    private String browser;

    @Column(name = "STATUS")
    private Long status;
}
