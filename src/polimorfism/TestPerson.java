package polimorfism;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Jordi",23);
		person.addAddress("Spain", "Barcelona", "Carrer de Balmes", 154);
		System.out.println(person.toString());
		Person.Address address = person.new Address("Spain", "Barcelona", "Carrer d'Arago",20);
		System.out.println(address.toString());
		person.addAddress(address);
		person.printAddress();
	}

}
