package Java;

import java.util.Scanner;

public class TestNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter the Number : " );
		int num = scanner.nextInt();
		
		if(num%3==0) {
			
			System.out.println("The number is divisible by 3:-" +num);
		}else {
			System.out.println("The number is not divisible by 3 : -" +num);
		}
				

	}

}
