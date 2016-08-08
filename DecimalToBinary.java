import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {

	static Scanner scan = new Scanner(System.in);
	public static void decimalToBinary(int n){
		List<Integer> digits = new ArrayList<Integer>();
		while(n > 0){
			digits.add(n % 2);
			n /= 2;
		}
		Collections.reverse(digits);
		System.out.print("The binary form of the given number is: ");
		for(int i : digits){
			System.out.print(i);
		}
}
	
	public static void main(String[] args){
		int input;
		try{
			System.out.println("Enter a number: ");
		    input = scan.nextInt();
		    while(input < 0){
		    	System.out.println("The program can't accept negative numbers! Please enter a valid number: ");
		    	input = scan.nextInt();
		    }
		decimalToBinary(input);	
		}
		catch(InputMismatchException e){
			System.out.println("Error: The program can't accept alphabets!");
		}
		}
}