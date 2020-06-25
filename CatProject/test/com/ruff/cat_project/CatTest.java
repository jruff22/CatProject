package com.ruff.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CatTest {
	
	private static Cat felix;
	private static Cat felix1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Cat ("Felix", "Male", 6, false, 8.8);
	}

	@Test
	//<method under test>_(GivenParameters_<Result you Expect>()
	void cat_GivenThreeParameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("Male", felix.getGender());
		assertEquals(6, felix.getAge());
		// assertNotEquals(7, felix.getAge());
		assertEquals(8.8, felix.getWeight());
		//assertNotEquals(10.8, felix.getWeight());
		assertEquals(false, felix.isAMouser());
		//assertNotEquals(true, felix.isAMouser());
		felix.meow(7);
	
		
		
	
		
		
	
		
		
//		fail("Not yet implemented");
	}

}
