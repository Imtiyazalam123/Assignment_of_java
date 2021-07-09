import java.util.Scanner;
class Test13 {

	public static void main(String args[]) {
   		int a[][] = new int[4][4];
		int b[][] = new int[4][4];
		int c[][] = new int[4][4];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 16 numbers for first matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) 
				a[i][j] = in.nextInt();
		}
		System.out.println("Enter 16 numbers for Second matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) 
				b[i][j] = in.nextInt();
		}
		System.out.println("First matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) 
				System.out.print("\t"+a[i][j]);
			System.out.println();
		}
		System.out.println();
		System.out.println("Second matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) 
				System.out.print("\t"+b[i][j]);
			System.out.println();
		}
		for(int i = 0; i < a.length; i++) {
			int sum = 0;
			for(int j = 0; j < a.length; j++) {
				for(int k = 0; k < a.length; k++) {
					sum += a[i][k] * b[k][j];
					c[i][j] = sum;
				}
			}		
		}
		System.out.println("Product of 2D matric are:"); 	
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) 
				System.out.print("\t"+c[i][j]);
			System.out.println();
		}	
 	}
}