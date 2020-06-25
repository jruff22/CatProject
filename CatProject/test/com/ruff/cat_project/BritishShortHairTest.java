package com.ruff.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BritishShortHairTest {
	
	private static BritishShortHair fluffy;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fluffy = new BritishShortHair ("Fluffy", "Female", 4, true, 6.2);
	}

	@Test
	void test() {
	//	fail("Not yet implemented");
		assertEquals("Fluffy", fluffy.getName());
		assertEquals("Female", fluffy.getGender());
		assertEquals(4, fluffy.getAge());
		fluffy.meow(8);
	
	}

}
