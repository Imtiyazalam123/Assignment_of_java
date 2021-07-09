/* Write a program that accept an character and print whether it is a vowel or a consonent */

import java.util.Scanner;
class Test12 {

	public static void main(String args[]) {
		char c;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any charccter:");
		c = a.nextLine().charAt(0);
		switch(c) {
			case 'a' : System.out.println(c+" is vowel");
				break;
			case 'e' : System.out.println(c+" is vowel");
				break;
			case 'i' : System.out.println(c+" is vowel");
				break;
			case 'o' : System.out.println(c+" is vowel");
				break;
			case 'u' : System.out.println(c+" is vowel");
				break;
			default :  System.out.println(c+" is consonent");
		}
	}
}