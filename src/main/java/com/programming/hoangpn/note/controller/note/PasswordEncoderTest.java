package com.programming.hoangpn.note.controller.note;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author PhanHoang
 * 10/26/2020
 */


public class PasswordEncoderTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("hoangytm");
        System.out.println(encodedPassword);

    }

}