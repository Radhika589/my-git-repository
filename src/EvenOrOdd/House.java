package EvenOrOdd;

public class House {

	String address;
	int levels;
	int postcode;
	boolean isCool;
	char addressCharacter;
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}
	
	public String showAddress() {
		return address;
	}
	
	

}
