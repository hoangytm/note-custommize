package com.programming.hoangpn.note.dto.note;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PhanHoang
 * 10/26/2020
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDTO {
    private String noteName;
    private String userName;
}
