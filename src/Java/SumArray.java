package Java;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, World!");
	      Scanner scan = new Scanner(System.in);
	      int num=0,sum;
	      System.out.println("Enter the Number");
	      num=scan.nextInt();
	      
	      int[] myarray= new int[num];
	      
	      System.out.println("Enter the Number");
	      
	      for(int i=0;i< num;i++)
	      {
	        myarray[i]=scan.nextInt();
	        //myarray[i]=+myarray[i];
	      }
	      

	}

}
