package Java;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=num ;j++)
			{				
				if (i >=2 && j>=2 && i<=4 && j<=4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
					
				
			}
			System.out.println(" ");
		}

	}

}
