package com.example.feature.record;

public record Person(String name, int age) {
	public Person {
		if (name == null || name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Must provide a name!");
		}
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be a negative!");
		}
	}
}