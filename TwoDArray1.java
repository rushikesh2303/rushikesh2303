import java.util.*;
public class TwoDArray1 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int rows = 4;
		int columns = 4;

		int[][] array = new int[rows][columns];
        System.out.println("Enter Array Element \n ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] =sc.nextInt(); 
				
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
        sc.close();
	}
}
