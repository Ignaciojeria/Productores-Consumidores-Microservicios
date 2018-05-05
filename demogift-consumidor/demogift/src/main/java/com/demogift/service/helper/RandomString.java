package com.demogift.service.helper;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

public class RandomString {

	static final private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	final private Random rng = new SecureRandom();    

	char randomChar(){
	    return ALPHABET.charAt(rng.nextInt(ALPHABET.length()));
	}

	public String randomUUID(int length, int spacing, char spacerChar){
	    StringBuilder sb = new StringBuilder();
	    int spacer = 0;
	    while(length > 0){
	        if(spacer == spacing){
	            sb.append(spacerChar);
	            spacer = 0;
	        }
	        length--;
	        spacer++;
	        sb.append(randomChar());
	    }
	    return sb.toString();
	}
	
}
