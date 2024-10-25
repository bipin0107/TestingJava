package Java;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 5; // Change this to any size you want for the square

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		

	}

}
