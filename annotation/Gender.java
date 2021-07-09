import java.util.Scanner;
import java.util.Scanner;
@What(descrption = "An Annotation Enum Gender")
enum Gender {
	Male, Female;
	public static Gender acceptGender() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase("male"))
			return Male;
		else
			return Female;
	}
};