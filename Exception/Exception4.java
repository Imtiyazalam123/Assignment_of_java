 class Exception4 {
	public static void main(String args[]) {
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
			if(num > 25) {
				num = 0;
				throw new ArithmeticException ("Number should be less than 26");
			}
		} 
		finally {
			for(int i = 1; i <= 10; i++)
				System.out.println(num+" * "+ i +" = "+num * i);
		}
	}
}