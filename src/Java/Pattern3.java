package Java;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5; // Number of rows
        int stars = rows; // Initial number of stars

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("* ");
            }
            stars--;
            System.out.println();
        }
	}
	}


