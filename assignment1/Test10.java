/* Write a program that accept a character and print whether it is an uppercase, lowercase or special character 
without using logical operators */

import java.util.Scanner;
class Test10 {
	public static void main(String args[]) {
		char c;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Character:");
		c = a.nextLine().charAt(0);
		if(c >= 'a') {
			if( c <= 'z')
				System.out.println("lowercase:"+c);
		}
		else if(c >= 'A') {
			if(c <= 'Z')	
				System.out.println("uppercase: "+c);
	                   		
		}
		else
			System.out.println("Specialcase : "+c);
	}
}
			
