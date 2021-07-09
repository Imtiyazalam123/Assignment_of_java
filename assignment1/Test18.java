/* Write a program  that accepts a number and print whether it is a prime or a composite number. */

import java.util.Scanner;
class Test18 {

	public static void main(String args[]) {
		int no, b=0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any number:");
		no = a.nextInt();
		for(int i = 2; i < no; i++) {
			if(no%i == 0) 
				b = 1;
				break;
		}
		if(b == 0)
			System.out.println(no+" is Prime number:");
		else
			System.out.println(no+" is Composite numer:");
		
	}
}