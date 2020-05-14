import java.util.Scanner;
public class Option {
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		int select;
		System.out.println("Welcome To The Mocha Restaurant");
		System.out.println("\n Select From The Following Options According To Your Desire");
		System.out.println("\n Let Us Know What Would You Like To have");
		System.out.println("==========================================");
		System.out.println("| 1. Cold Drinks |");
		System.out.println("| 2. Coffee |");
		System.out.println("| 3. Tea |");
		System.out.println("| 4. Shakes |");		
		System.out.println("| 5. Pizza |");
		System.out.println("| 6. Sandwitch |");
		
		System.out.println("===========================================");
		System.out.println("Please Select The Option Now");
		
		select = sc.nextInt();
		
		switch(select) {
		case 1:
			coldDrinks();
			break;
		case 2:
			coffee();
			break;
		case 3:
			tea();
			break;
		case 4:
			shakes();
			break;
		case 5:
			pizza();
			break;
		case 6:
			sandwitch();
			break;
		case 7:
			System.out.println("Thank you for visiting");
			break;
		default:
			complimentary();
			
		}
	}
public void coldDrinks() {
	// selected 1 
	System.out.println("You have selected cold drings.");
	System.out.println("Here are the available cold drinks");
	System.out.println("| 1. Mojito Mocktail |");
	System.out.println("| 2. Coca cola |");
	System.out.println("| 3. Lemonade |");
	System.out.println("| 4. Nectar |");
}
public void coffee() {
	// selected 2
	System.out.println("You have selected Coffee");
	System.out.println("Here are the available Coffee");
	System.out.println("| 1. cold coffee |");
	System.out.println("| 2. Latte |");
	System.out.println("| 3. Espresso |");
	System.out.println("| 4. Cappuccino |");
}
public void tea() {
	// selected 3
	System.out.println("You have selected Tea");
	System.out.println("Here are the available Tea");
	System.out.println("| 1. Green Tea |");
	System.out.println("| 2. Lemon Tea |");
	System.out.println("| 3. Ice Tea |");
	System.out.println("| 4. Black Tea|");
}
public void shakes() {
	// selected 4
	System.out.println("You have selected Shakes");
	System.out.println("Here are the availale Shakes");
	System.out.println("| 1. Orea Shake |");
	System.out.println("| 2. Kitkate Shake |");
	System.out.println("| 3. Nutella Shake |");
	System.out.println("| 4. Ferrero Rocher Shake |");
	
}
public void pizza() {
	// selected 5
	System.out.println("You have selected Pizza");
	System.out.println("Here are the available Pizza");
	System.out.println("| 1. Margareta Pizza |");
	System.out.println("| 2. Paneer Parcel |");
	System.out.println("| 3. Seven Cheezy |");
	System.out.println("| 4. Onion N Capsicum|");
}
public void sandwitch() {
	//selected 6
	System.out.println("You have selected Sandwitch");
	System.out.println("Here are the available Sandwitch");
	System.out.println("| 1. Vegitable Sandwitch |");
	System.out.println("| 2. Plain alloo matar Sandwitch |");
	System.out.println("| 3. Club Sandwitch |");
	System.out.println("| 4. Chocolate slice |");
}
public void complimentary() {
	//default
	System.out.println("Here are the complimentary from the hotel ");
	System.out.println("| 1. water |");
	System.out.println("| 2. tea |");
	System.out.println("| 3. rosted papad |");
}

	public static void main(String[] args) {
		Option a = new Option();  // created object of class
		a.mainMenu();             // called the method with the help of the object

	}

}
