package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;

public class AssumptionsExample {
	
	@BeforeEach
	public void setup() {
		
		System.setProperty("ENV", "PROD");
		
		
	}
	
	@Test
	public void test1() {
		
	    assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@Test
	public void test2() {
		
		assumeFalse("PROD".equals(System.getProperty("ENV")));
		assertFalse(StringFunctions.isPalindrome("nikunj"));
	}

}

