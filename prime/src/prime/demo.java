package prime;
import java.util.Scanner;
class First{
	
	public void get() {
	Scanner sc = new Scanner(System.in);
	 System.out.println("This is the program for checking the number whether it is prime or not");
	 System.out.println("======================================================================");
	 System.out.println("Enter the number you wanna check");
	 int n = sc.nextInt();
	 if(n==0 || n==1) 
		 System.out.println("The number is not prime number");
	 else {
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 System.out.println("The number is not prime number");
			 	return ;
			 }
			 else {
				 System.out.println("The number is prime number");
			     return;
			 }
		 }
	}
	}
	
}
public class demo extends First{

	public static void main(String[] args) {
			 First a= new First();
		a.get();
		System.out.println("======================================================================17");
	}

}
