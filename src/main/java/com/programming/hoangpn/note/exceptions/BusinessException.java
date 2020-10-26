package com.programming.hoangpn.note.exceptions;


import lombok.Data;

@Data
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
