package Java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{ String str = "Automations Automations"; 
		
		// Convert string to character array 
		char[] charArray = str.toCharArray(); 
		// Use LinkedHashSet to maintain the order and remove duplicates
		Set<Character> charSet = new LinkedHashSet<>(); 
		for (char c : charArray)
		{ 
			charSet.add(c); 
		} // Build the resulting string 
		StringBuilder sb = new StringBuilder(); 
		for (Character c : charSet) { 
			sb.append(c); 
		} 
		System.out.println("String after removing duplicate characters: " + sb.toString());
		
		}
		}
}
