import java.util.Scanner;
enum FurnitureType {
	Chair, Table, Bed;
	public static FurnitureType acceptFurnitureType() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase("chair"))
			return Chair;
		else if(str.trim().equalsIgnoreCase("table"))
			return Table;
		else
			return Bed;
	}
};
