package imtiyaz;

import java.io.*;
//import java.io.Serializable;
import java.util.Scanner;

class Friend implements Serializable {

	protected String name;
	protected String phoneNO;
	protected String address;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, String phoneNO, String address) {
		super();
		this.name = name;
		this.phoneNO = phoneNO;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNO() {
		return phoneNO;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNO = phoneNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
//	@Override
//	public String toString() {
//		return "Friend [name=" + name + ", phoneNO=" + phoneNO + ", address=" + address + "]";
//	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = in.nextLine();
		System.out.println("Enter phoneNo : ");
		phoneNO = in.nextLine();
		System.out.println("Enter address : ");
		address = in.nextLine();
	}
}
