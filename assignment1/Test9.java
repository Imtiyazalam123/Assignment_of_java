/* Write a program that accept a character and print whether it is an uppercase, lowercase, digit or special character 
     ASCII Value
	A - 65, B - 66, ................Z - 90
	a - 97, b - 98, ................z -122
	'0' - 48, '1' - 49, ..................'9' - 57   */

import java.util.Scanner;
class Test9 {
	public static void main(String args[]) {
		char c;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Character:");
    		c = a.nextLine().charAt(0);
		if(c >= 65 && c <= 90) 
			System.out.println("uppercase: "+c);
		else if(c >= 97 && c <= 122)
			System.out.println("lowercase: "+c);
		else if(c >= 48 && c <= 57)
			System.out.println("Digit :"+c);
		else
			System.out.println("Special character:");
	}
}