package Java;

import java.util.HashMap;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String strnewString = scanner.nextLine();
		
		//String str1= " I love India";
		
		HashMap< Character, Integer> countMap= new HashMap<>();
		
		for(Character c: strnewString.toCharArray())
		{
			if(countMap.containsKey(c)) {
			countMap.put(c,countMap.get(c)+1);
			}
			else {
				{
					
					countMap.put(c, 1);
				}
			}
		}
		System.out.println(countMap);
		

	}

}
