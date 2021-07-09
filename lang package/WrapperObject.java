class WrapperObject {

	public static void main(String args[]) {

   		 String str = args[0];
		// String to all Wrapper Object
		Byte b = Byte.valueOf(str);
		System.out.println(b);
		Short s = Short.valueOf(str);
		System.out.println(s);
		Integer i = Integer.valueOf(str);
		System.out.println(i);
		Long l = Long.valueOf(str);
		System.out.println(l);
		Float f = Float.valueOf(str);
		System.out.println(f);
		Double d = Double.valueOf(str);
		System.out.println(d);
		Boolean bool = Boolean.valueOf(str);
		System.out.println(bool);
		
		//String to all primative type

		byte b1 = Byte.parseByte(str);
		System.out.println(b1);
		short s1 = Short.parseShort(str);
		System.out.println(s1);
		int i1 = Integer.parseInt(str);
		System.out.println(i1);
		long l1 = Long.parseLong(str);
		System.out.println(l1);
		float f1 = Float.parseFloat(str);
		System.out.println(f1);
		double d1 = Double.parseDouble(str);
		System.out.println(d1);
		boolean bool1 = Boolean.parseBoolean(str);
		System.out.println(bool1);	
  	}
}