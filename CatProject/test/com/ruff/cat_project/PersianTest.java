package com.ruff.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersianTest {
	private static Persian garfield;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
			garfield = new Persian ("Garfield", "Male", 7, false, 5.1);
	}

	@Test
	void test() {
		assertFalse(garfield.isAMouser()); 
		assertEquals("Male", garfield.getGender());
		assertEquals(7, garfield.getAge());
		garfield.meow(5);
		garfield.setWeight(5.1);
		
		
		//fail("Not yet implemented");
	}

}
