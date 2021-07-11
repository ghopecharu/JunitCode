package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface TestInterface {
	
	public void method1();
	
	@Test
	default void test1() {
		assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
}
