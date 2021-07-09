package imtiyaz;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DisplayDetails extends Friend {

	public static void main(String args[]) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("friend.txt"))) {
			for(int i = 0; i <= 10; i++) {	
				Friend f = (Friend) in.readObject();
				//System.out.println(f);   //generate this exception after printing f "java.io.InvalidClassException"
				System.out.println("Name : "+f.getName()+", Phone Number : "+f.getPhoneNO()+", Address : "+f.getAddress());
				
			} 
		} catch(EOFException eof) {
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
