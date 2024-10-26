package Java;

import java.util.Scanner;

public class InitialLetterofName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Full Name :-");
		String fullname=scan.nextLine();
		
		String[] initialletter = fullname.trim().split("\\s+");
		StringBuilder sBuilder=new StringBuilder();
		
		for(String name : initialletter)
		{
			sBuilder.append(name.charAt(0)).append(" ");
			
		}
		
		
		System.out.println("Initial Letter :" +sBuilder.toString().trim());
		

	}

}
