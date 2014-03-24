package isPrime;
import java.util.*;


public class IsPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.print("Please provide a number to check if prime:");
		x = input.nextInt();
		
		
		boolean isPrime = true;
		int i = 2;
		do{
			if(x % i == 0) {
				System.out.println("The number " + x + " is NOT prime.");
				isPrime = false;
			}
		i++;
		}while(i < x && isPrime == true);
			
		if(isPrime == true) {
			System.out.println("The number " + x + " is prime.");
		}
		
		input.close();
	}

}
