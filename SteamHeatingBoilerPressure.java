import java.util.Scanner;

/**
 * @author Arash
 *
 *We have a steam heating boiler whose bursting pressure is known, but we of course want to use it only at 
 *pressures well below this limit. Our engineers recommend a safety factor of 3; that is, we should never 
 *exceed a pressure that is one-third of the rated bursting pressure.
 *Write a program that reads in the rated bursting pressure and the current pressure, and determines if the 
 *boiler is operating at a safe pressure.
 *
 *For example:
 *Enter the rated bursting pressure of the boiler (psi): 625
 *Enter the current pressure (psi): 137.8
 *The maximum safe pressure is 208.3 psi.
 *The current pressure is safe.
 *or
 *Enter the rated bursting pressure of the boiler (psi): 625
 *Enter the current pressure (psi): 250
 *The maximum safe pressure is 208.3 psi.
 *WARNING!  The current pressure is not safe.
 */

//import packets
import java.util.Scanner;
public class SteamHeatingBoilerPressure 
{

	public static void main(String[] args) 
	{
		//variables
		double ratedPressure;
		double currentPressure;
		double maximumPressure;

		//input //create object scanner
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("Enter the rated bursting pressure of the boiler (psi):");
		ratedPressure = keyboard.nextDouble();
		
		System.out.print("Enter the current pressure (psi):");
		currentPressure = keyboard.nextDouble();
		
		//calculated 1/3 psi of rated bursting pressure 
		maximumPressure = ratedPressure * (1.0/3.0);
		
		//output
		System.out.printf("The maximum safe pressure is %.1f psi.\n", maximumPressure);
		
		//check entered psi is more than 1/3 of rated bursting pressure 
		if (maximumPressure >= currentPressure)
			System.out.println("\nThe current pressure is safe.");		
		else System.out.println("\nWARNING! The current pressure is not safe.");
		
		//closes object scanner
		keyboard.close();
	}

}
