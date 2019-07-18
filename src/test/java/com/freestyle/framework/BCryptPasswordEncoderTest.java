package com.freestyle.framework;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {
    
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String planText = "password";
        System.out.println("planText encode result is " + encoder.encode(planText));
    }
}
