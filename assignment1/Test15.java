/* Write a program that displays sum and average of multiples of 5 from 500 to 600. */

class Test15 {

	public static void main(String args[]) {
		int mul = 0;
		float sum =0;
		for(int i = 500; i <= 600; i++) {
			mul = 5 * i;
			sum = sum+mul;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average is: "+sum/100);
	}
}