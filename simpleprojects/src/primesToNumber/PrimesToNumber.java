package primesToNumber;
import java.util.Scanner;


public class PrimesToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please provide a number to check if prime:");
		int x = input.nextInt();
		
		
		
		int i = 4;
		while(i < x){
				boolean isPrime = true;
				int j = 2;
				while(j < i || isPrime == true){
					isPrime = true;
					if(i % j == 0) {
						System.out.println("The number " + j + " is NOT prime.");
						isPrime = false;
					}
				j++;
				}
		i++;
		}
		
		
		input.close();
	}

}
