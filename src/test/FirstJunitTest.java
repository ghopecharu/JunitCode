package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {
	
    @BeforeAll
    
    public static void BeforeAllMethod() {
    	
    System.out.println("Inside Before All ");
    }
    
    
	@Test
	
	public void testcase1() {
		boolean flag = true;
		Assertions.assertTrue(flag); 	
		
	System.out.println("Inside Testcase 1");
	}
	
	@AfterEach
	
	public void afterEach() {
		
	System.out.println("Inside After Each ");
	}
}
