package com.example.demo.Security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
		 
	    public static void main(String[] args) {
	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        String encodedPassword = passwordEncoder.encode("sruthi@2002");
	         
	        System.out.println(encodedPassword);
	 
	    }
	 
}
