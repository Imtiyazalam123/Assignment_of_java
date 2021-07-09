import java.util.Scanner;
class Test9 {

	public static void main(String args[]) {
	             	int[][] arr = new int[4][5];
		int rowSum[] = new int[arr.length];
		int colSum[] = new int[arr[0].length];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 20 numbers:");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				rowSum[i] += arr[i][j];
				colSum[j] += arr[i][j];
			}
		}
		System.out.println("\t");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++)
				System.out.print("\t"+arr[i][j]);
			System.out.println("    row sum: "+rowSum[i]);
		}
		System.out.print("colSum: ");
		for(int j = 0; j < arr.length; j++) {
				System.out.print("\t"+colSum[j]);
		}
		
	}
}