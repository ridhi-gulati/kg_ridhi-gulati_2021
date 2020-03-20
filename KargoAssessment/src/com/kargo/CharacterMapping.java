package com.kargo;

import java.util.HashMap;


public class CharacterMapping {
	
	public static void main(String args[])  {
		
		try {		
			System.out.println(isCharacterMapped (args[0], args[1]));
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter 2 parameters to run the program.");
			}
			catch(Exception e) {
				System.out.println("Program Terminated due to exception");
			}
	}
	
	public static boolean isCharacterMapped (String str1, String str2) {
		
		if(str1 == null || str2 == null || str1.length() != str2.length() ) {
			return false;
		}
		
		HashMap<Character, Character> CharacterMap = new HashMap<>();
	    for (int i = 0; i < str1.length(); i++) {
	        char char1 = str1.charAt(i);
	        char char2 = str2.charAt(i);
	 
	        //If the Character is already mapped in the hashmap, and key value pair is not same then return false
	        if (CharacterMap.containsKey(char1)) {
	            if (CharacterMap.get(char1) != char2) {
	            	return false;
	            }
	        } // Else put the key value
	        else {
	        	CharacterMap.put(char1, char2);
	        }
	    }
	    return true;	
	}

}
