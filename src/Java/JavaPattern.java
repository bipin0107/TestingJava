package Java;

import java.util.Scanner;

public class JavaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter the Number:"); int num1=scan.nextInt();
		 */
	      
	      int num=5;
	      
	      for(int i=1;i<=num;i++)
	      {
	        for(int j=1;j<=num;j++)
	        {
	          //System.out.print(" * ");
	        	if(i>=2 && j>=2 && i<=4 && j<=4)
	        	{
	        		System.out.print(" ");
	        	}
	        	else 
	        	{       		
	        		System.out.print("*");
	        			
	        		}
				}
	        System.out.println();
	        }
	      }

	

}

