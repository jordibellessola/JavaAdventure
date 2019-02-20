package polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private List <Address> addresses = new ArrayList<Address>();
	private int age;
	private String name;
	
	public Person(String _name,int _age) {
		this.name = _name;
		this.age = _age;
	}
	
	public void addAddress(Address _addresses) {
		addresses.add(_addresses);
	}
	
	public void addAddress(String _country,String _province,String _street,int _number) {
		addresses.add(new Address(_country, _province, _street, _number ));
	}
	
	public void printAddress() {
		for(Address address: addresses) {
			System.out.println(address);
		}
	}
	
	public String toString() {
		return this.name+" "+this.age;
	}
	
	class Address{
		
		private String country;
		private String province;
		private String street;
		private int number;
		
		public Address(String _country,String _province,String _street,int _number){
			this.country = _country;
			this.province = _province;
			this.street = _street;
			this.number = _number;
		}
		
		public String toString() {
			return this.street+" "+this.number+" "+this.province+" "+this.country;
		}
		
	}
	
}
