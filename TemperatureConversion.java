/** Program: Temperature Conversion
* File: TemperatureConversion.java 
* Summary: Program converts Fahrenheit to Celsius.
* Author: Lyric Payton
* Date: September 16, 2018
**/


//imports utilities 
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
//utility	
		Scanner input = new Scanner(System.in); 
//enter number in farenheit		
		System.out.print("Enter the temperature in Fahrenheit:");
		double fahrenheit = input.nextDouble();
// conversion equation	
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println("Fahrenheit " + fahrenheit + " is equalivent to " + celsius + " in Celsius");

	}

}
