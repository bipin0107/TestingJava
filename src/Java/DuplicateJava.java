package Java;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str =scan.nextLine();
		
		String[] strarr=str.split("");
		
		Set<String> set = new LinkedHashSet<>();
		
		for (String ic: strarr)
		{
			set.add(ic);
			
		}
		
		StringBuilder sBuilder=new StringBuilder();
		for(String ch: set)
		{
			
			sBuilder.append(ch);
		}
		
		System.out.println(sBuilder);
		
		

	}

}
