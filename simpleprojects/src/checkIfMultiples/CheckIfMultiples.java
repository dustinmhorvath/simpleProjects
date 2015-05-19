package checkIfMultiples;

import java.util.Scanner;

public class CheckIfMultiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Find if one number is a factor of the other
		System.out.println("Give me 2 numbers and I'll find out if they're multiples.");
		System.out.print("First number: ");
		int firstnumber = input.nextInt();
		System.out.print("Second number: ");
		int secondnumber = input.nextInt();
		if(firstnumber % secondnumber == 0) {
			System.out.println("They're multiples!");
		}
		else if(secondnumber % firstnumber == 0) {
			System.out.println("They're multiples!");
		}
		else {
			System.out.println("The numbers are NOT multiples.");
		}
		
		input.close();
	}
	
}
