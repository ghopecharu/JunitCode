package test;

public class StringFunctions {
	
	public static boolean isPalindrome(String str) {
	 //Pointers pointing to the beginning 
		//and the end of the string.
		
		int i=0, j=str.length()-1;
		while(i<j) {
			//if there is mismatch
			if(str.charAt(i)!=str.charAt(j))
				return false;
			//Increment first pointer and decrement the other
			i++;
			j--;
		}
		//given string is palindrome.
		return true;
		
		}
	}


