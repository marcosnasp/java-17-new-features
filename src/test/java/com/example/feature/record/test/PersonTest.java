package com.example.feature.record.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.feature.record.Person;

public class PersonTest {

	@DisplayName("Test If Person is Marcos, and his age is 37")
	@Test
	void testMarcosPerson() {
		Person p = new Person("Marcos", 37);
		assertEquals(p.name(), "Marcos");
		assertEquals(p.age(), 37);
	}
	
	@DisplayName("Test A Person with Invalid Attributes")
	@Test
	void testMarcosPersonWithInvalidAttributes() {
		assertThrows(IllegalArgumentException.class, () -> new Person("", -1));
	}
	
}
