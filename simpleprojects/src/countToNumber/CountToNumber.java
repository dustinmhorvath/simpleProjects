package countToNumber;
import java.util.*;


public class CountToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		do{
		System.out.println("Please input a number to count to. It must be positive:");
		number = input.nextInt();
		} while(number <= 0);
		
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		
		input.close();
	}

}
