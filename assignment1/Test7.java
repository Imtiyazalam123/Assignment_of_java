/*write a program that accepts temperature in Centigrade and display it in Fahrenheit. */

import java.util.Scanner;
class Test7 {
	protected float c = 0f, f = 0f;
	public void acceptTem() {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter Temperature in Centigrade(celsius) : ");
		c = t.nextFloat();
		f = c * 9/5+32;                                                                                        //formula    c/5 = f-32/9 = k - 273.15/5     
		c = 5 * (f - 32)/9;
		System.out.println("Temperature in Fahrenheit  : "+f);
		System.out.println("Temperature in Centigrade(celsius)  : "+c);
	}
	public static void main(String args[]) {
		Test7 obj = new Test7();
		obj.acceptTem();
	}
}