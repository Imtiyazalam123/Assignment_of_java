class Exception1 {
	
	public static void main(String args[]) {
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
			if(num > 25) {
				num = 0;
				throw new BigException("Number should be less than 26");
			}
		} 
		catch(NumberFormatException ne) {
			System.out.println("Invalid format");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Invalid Index");
		}
		catch(BigException e) {
			System.out.println(e.getMsg());
		}
		for(int i = 1; i <= 10; i++)
			System.out.println(num+" * "+ i +" = "+num * i);
	}
}