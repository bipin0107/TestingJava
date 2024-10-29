package Java;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=1;i<=4;i++) 
		{
			for(int j=3;j>=i;j--) 
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		

	}

}
