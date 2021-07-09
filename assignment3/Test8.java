import java.util.Scanner;
class Test8 {

	public static void main(String args[]) {
		int temp;
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for(int a = 0; a < arr.length; a++) {
			arr[a] = in.nextInt();
		}
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < = arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.print(" "+arr[j]);
		}
	}
}