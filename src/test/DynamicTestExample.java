package test;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
     //Using TestFactory annotations
	
	@TestFactory
    public Collection<DynamicTest> method1() {
        
        return Arrays.asList(
                  DynamicTest.dynamicTest("Positive Test",
                          () -> assertTrue(StringFunctions.isPalindrome("madam"))),
                    DynamicTest.dynamicTest("Negative Test Test",
                      () -> assertFalse(StringFunctions.isPalindrome("nikunj"))));
        
    }

	 }

