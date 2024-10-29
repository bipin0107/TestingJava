package Java;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("  ");
							
			}
			for(int k=1;k<=i;k++) {
				System.out.print("  *");
			}
			System.out.println("");
		}
	
	}
	

}
