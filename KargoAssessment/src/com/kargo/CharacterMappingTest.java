package com.kargo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterMappingTest {

	@Test
	void test() {
		
		boolean result1 = CharacterMapping.isCharacterMapped("foo", "bar");
		assertFalse(result1);
		
		boolean result2 = CharacterMapping.isCharacterMapped("bar", "foo");
		assertTrue(result2);
		
		boolean result3 = CharacterMapping.isCharacterMapped("null", "null");
		assertTrue(result3);
		
		boolean result4 = CharacterMapping.isCharacterMapped(null, null);
		assertFalse(result4);
		
		boolean result5 = CharacterMapping.isCharacterMapped("", null);
		assertFalse(result5);
		
		boolean result6 = CharacterMapping.isCharacterMapped(null, "");
		assertFalse(result6);
		
		boolean result7 = CharacterMapping.isCharacterMapped("1234", "2345");
		assertTrue(result7);
		
		boolean result8 = CharacterMapping.isCharacterMapped("1234", "235");
		assertFalse(result8);
		
		String str1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String str2 = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
		boolean result9 = CharacterMapping.isCharacterMapped(str1, str2);
		assertTrue(result9);
	}

}
