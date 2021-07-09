import java.io.File;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) {
		
		String dirName = args[0];
		File dir = new File(dirName);
		displayDirectoryContents(dir);
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("delet file:" + file.delete()+" from "+file.getPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
