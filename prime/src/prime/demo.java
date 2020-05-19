/**
 * <h1>This prime number program is used for finding the prime number.</h1>
 * <p>This program will find if the given number is prime or not. When you give a number it will check if the conditions for the prime number is satisfied or not. If yes than it will return that the number is prime.</p>
 */
package prime;
import java.util.Scanner;
class First{
	
	public void check() {
	Scanner sc = new Scanner(System.in);
	 System.out.println("This is the program for checking the number whether it is prime or not");
	 System.out.println("======================================================================");
	 System.out.println("Enter the number you wanna check");
	 int n = sc.nextInt();  //store the number to check
	 if(n==0 || n==1) 
		 System.out.println("The number is not prime number");
	 else {
		 for(int i=2;i<n;i++) {		
			 if(n%i==0) {
				 System.out.println("The number is not prime number");
			 	 return ;	//returns when the number is not prime
			 }
			 else {
				 System.out.println("The number is prime number");
			    	 return ;	//returns when the number is prime
			 }
		 }
	}
	}
	
}
public class demo extends First{

	public static void main(String[] args) {
		First a= new First();
		a.check();
		System.out.println("======================================================================17");
	}

}
