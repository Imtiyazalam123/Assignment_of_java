import java.util.Scanner;
enum Material {
	Irone, Steel, Wooden;
	public static Material acceptMaterial() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase("irone"))
			return Irone;
		else if(str.trim().equalsIgnoreCase("steel"))
			return Steel;
		else
			return Wooden;
	}

};