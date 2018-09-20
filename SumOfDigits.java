/** Program: SumOfDigits

* File: SumOfDigits.java 
* Summary: Program calculates the sum of digits with division .

* Author: Lyric Payton

* Date: September 16, 2018

**/


//imports utilities 
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
//		 display input
			Scanner input = new Scanner(System.in);
			// output to user to enter numbers
			System.out.println("Enter five numbers: ");
//	each number has an assigned variable
			int one = input.nextInt();
			int two = input.nextInt();
			int three = input.nextInt();
			int four = input.nextInt();
			int five = input.nextInt();
			
// First equation takes each input and multiplies by 10			
			int product = (one * 10)+ (two * 10) + (three * 10) + (four * 10) + (five * 10);
// second equation takes the added products and divides by 10		
	int quotient = product / 10;
			
//prints numbers the user entered		
			System.out.println("You entered"+ " "+ one +"," + two +", "+ three +"," + four +", "+five);
// prints out the average		
			System.out.println("The average is"+"  " + quotient);	
		    }
}
