package Java;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 1 2 3 5 8 13
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =scan.nextInt();
		
		int nfirst=0, nnext=1,sum;
		 
		for(int i=1;i<=n;i++)
		{
			System.out.print(+ nfirst + " ");
			sum=nfirst+nnext;
			nfirst=nnext;
			nnext=sum;
			
		}
		
		
		
	}

}
