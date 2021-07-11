package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestInterfaceImplementation implements TestInterface{
@Override
public void method1() {
	System.out.println("Inside Class");
}
@Test
public void test2() {
	assertTrue(StringFunctions.isPalindrome("madam"));

}
}
