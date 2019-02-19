package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private List<Address> addresses = new ArrayList<Address>();
	
	public void printAddress() {
		for(Address address: addresses) {
			System.out.println(address);
		}
	}
	
	class Address{
		
		private String country;
		private String province;
		private String street;
		private int number;
		
	}
	
}
