class Exception3 {
	public static int funcCube(int a) {
		int b = a;
			if(a > 100) {
				Exception2 e = new Exception2("NoCubeException");
				throw e;
			}

		return b * b * b;
	}
	public static void main(String args[]) {
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
				num = funcCube(num);		 
			
		}
		catch(Exception2 e1) {
			System.out.println(e1.getMsg());
		}
		System.out.println("Cube is : "+num);
	}
}
