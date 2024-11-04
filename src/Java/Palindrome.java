package Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Words: ");
		String str=scanner.nextLine();
		
		StringBuilder sBuilder = new StringBuilder(str);
		sBuilder.reverse();
		if(str.equals(sBuilder.toString()))
		{
			System.out.println("The Strings are Plaindrome");
		}
		else 
		{
			System.out.println("The Strings are not Plaindrome");
		}

	}

}
