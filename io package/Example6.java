import java.io.*;
public class Example6 {

	public static void main(String[] args) {
	
		String file1, file2, str1;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter file name 1");
			file1 = br.readLine();
			System.out.println("Enter file name 2");
			file2 = br.readLine();
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));	
			while((str1 = br1.readLine()) != null) {
				bw.write(str1);
				bw.flush();
			}
			br1.close();
			bw.close();
		}catch(IOException ie) {
			
		}
		
	}

}

