/* Write a program that display fibonacci series of 20 elements. */

class Test20 {

	public static void main(String args[]) {
		int a = 0, b = 1, c = 0, ct = 0;
		System.out.println(a);
		System.out.println(b);
		while(ct < 18) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			ct++;
		}
	}
}