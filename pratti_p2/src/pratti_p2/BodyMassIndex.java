
package pratti_p2;

import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		
		double pounds,inches ,kilograms ,meters,BMI = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose option for inputs height and weight: \n 1. Pounds and inches \n2. Kilograms and Meters");
		int option = scnr.nextInt();
		switch(option) {
		case 1:System.out.println("Enter weight in pounds :");
			pounds = scnr.nextDouble();
			System.out.println("Enter height in inches :");
			inches = scnr.nextDouble();
			BMI= 703*pounds / (inches*inches);
			break; 
		
		case 2:System.out.println("Enter weight in kilograms:");
			kilograms = scnr.nextDouble();
			System.out.println("Enter height in meters:");
			meters = scnr.nextDouble();
			BMI= kilograms / (meters*meters);
			break;
		  
		default:System.out.println("invalid choice");
			break;
		}
		
		if(BMI<=18.5)
			System.out.println("BMI is less than 18.5 means: UnderWeight");
		else if(BMI<=24.9)
			System.out.println("BMI between 18.5 and 24.9 means: Healthy");
		else if(BMI<=29.9)
			System.out.println("BMI between 25 TO 29.9 means: Overweight");
		else
			System.out.println("BMI greater than or equal to 30.0 means: obese");
		
	}

}
