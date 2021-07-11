package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Assertionexample {
	@Test
	public void test1() {
		String expected = "Hi There";
		String actual = "Hi There";
		//Assertions.assertEquals(expected,actual);
		assertEquals(expected,actual);
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		assertArrayEquals(expectedArray,resultArray);
		 boolean flag =true;
		 assertTrue(flag);
	}

}
