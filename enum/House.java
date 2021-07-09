import java.util.Scanner;
enum House {
	Palash("Orange"), Gulmohar("Red"), Kachnar("Purble"), Amaltas("Yellow");
	private String color;
	House(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public static House acceptHouse() {
		Scanner a = new Scanner(System.in);
		String str1 = a.nextLine();
		if(str1.trim().equalsIgnoreCase("palash"))
			return Palash;
		else if(str1.trim().equalsIgnoreCase("gulmohar"))
			return Gulmohar;
		else if(str1.trim().equalsIgnoreCase("kachnar"))
			return Kachnar;
		else
			return Amaltas;
	}
};