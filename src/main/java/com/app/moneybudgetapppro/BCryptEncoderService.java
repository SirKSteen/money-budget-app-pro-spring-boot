package com.app.moneybudgetapppro;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderService {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		
			String encodedString = 
					encoder.encode("000");
			System.out.println(encodedString);

	}
}
