package imtiyaz;
import java.io.*;
public class Example4 {

	public static void main(String args[]) {
		String dirName = args[0];
		File dir = new File(dirName);
		System.out.println("Directory : "+dir.isDirectory());
		String list[] = dir.list();
		for(String fnd : list)
			if(fnd.isFile())
			System.out.println("Set Read Only : "+fnd.setReadOnly());
	}
}
