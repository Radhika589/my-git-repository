package EvenOrOdd;

public class MyBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House myHouse = new House ();
		House yourHouse = new House ();
		
		yourHouse.changeAddress ("Korsvägen 1");
	    myHouse.changeAddress("IT - gatan 1");
	    
	    myHouse=yourHouse;
		
		System.out.println(myHouse.showAddress());
		System.out.println(yourHouse.showAddress());
		

	}

}
