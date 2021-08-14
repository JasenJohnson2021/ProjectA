package main;
import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		//create a new scanner object
		Scanner sc = new Scanner(System.in);
		
		//variable to hold user choice 
		int menuSelection;
		
		/*
		 * Menu with the menu options in a do while loop to continue the menu until the user decides 
		 * to exit the program by choosing option 6
		 */
		
		do {
			System.out.println();
			System.out.println("Please make a selection: ");
			System.out.println();
			System.out.println("1. Cups to teaspoons.");
			System.out.println("2. Liters to Gallons.");
			System.out.println("3. Celsius to Farenheit.");
			System.out.println("4. Miles to Kilometers.");
			System.out.println("5. Inches to millimeters.");
			System.out.println("6. Exit the program. ");
			menuSelection = sc.nextInt();
			
			
			/* if statement to check and make sure user has entered a valid numerical 
			 * menu choice. If user enters anything other then a numerical value the 
			 * program will crash
			 */
			if(menuSelection < 1 || menuSelection > 6 ) {
				System.out.println("Invalid choice please try again");
			}
			//switch statement to call various methods based on the menu selection choice 
			switch(menuSelection) {
				case 1: CupstoTeaspoons();
					break;
				case 2: LiterstoGallons();
					break;
				case 3:CelsiusToFarenHeight();
					break;
				case 4:MilesToKilometers();
					break;
				case 5: InchesToMillimeters();
					break;
				
			}
		}while(menuSelection != 6);
		
		//a way to exit the menu if option 6 is chose 
		if(menuSelection == 6 ) {
			System.out.println("Exiting the prongram...");

		}
		//closing the scanner
		sc.close();
		//letting user know the program is over
		System.out.println("End of Program");
	}
	
	//Cups to teaspoons method 
	public static void CupstoTeaspoons() {
		//prompt for the user to know what to do
		System.out.println("Enter the number of cups to convert.");
		//instance of scanner to use in method
		Scanner sc = new Scanner(System.in);
		//int to represent users choice
		int cups; 
		//taking user value and storing it in cups 
		cups = sc.nextInt();
		//int to represent number of teaspoons in a cup
		int teaspoons = 48;
		
		//printing out the user choice of number of cups along with the calculation to convert to teaspoons
		System.out.println( cups + " cups equals " + (cups * teaspoons) + " teaspoons");
		}
	
	//Liters to gallons method
	public static void LiterstoGallons() {
		//prompt for the user to know what to do
				System.out.println("Enter the number of Liters to convert.");
				//instance of scanner to use in method
				Scanner sc = new Scanner(System.in);
				//int to represent users choice
				int Liters; 
				//taking user value and storing it in cups 
				Liters = sc.nextInt();
				//int to represent number of teaspoons in a cup
				double Gallons = 0.26;
				
				//printing out the user choice of number of cups along with the calculation to convert to teaspoons
				System.out.println( Liters + " Liters equals " + (Liters * Gallons) + " Gallons");
	}
	
	//Celsius to Farenheit
	public static void CelsiusToFarenHeight() {
		System.out.println("Enter the number of a temperature in Celsius to convert.");
		//instance of scanner to use in method
		Scanner sc = new Scanner(System.in);
		//int to represent users choice
		float Celsius; 
		//taking user value and storing it in Celsius 
		Celsius = sc.nextFloat();
		//float to store decimal value in Farenheight
		float Farenheight;
		// formula to convert celsius to Farenheight
		Farenheight = (((Celsius *9/5)) + 32);
		
		//printing out the user choice of Celsius along with converted Farenheight
		System.out.println( Celsius + " Degrees in Celsius equals " + Farenheight + " Degrees in Farenheight");
	}
	
	//Miles to Kilometers
	public static void MilesToKilometers() {
		System.out.println("Enter the number of miles to convert to kilometers.");
		//instance of scanner to use in method
		Scanner sc = new Scanner(System.in);
		//int to represent users choice
		double Miles; 
		//taking user value and storing it in Celsius 
		Miles = sc.nextDouble();
		//float to store decimal value in Farenheight
		double Kilometers = 1.609;
		
		//Printing out miles of user choice and converting to kilometers 
		//some conversion is lost once you go past somewhere around 40 miles
		System.out.println(Miles + " miles = " + Miles * Kilometers + " kilometers:");
	}
	
	//Inches to millimeters
	public static void InchesToMillimeters() {
		System.out.println("Enter the number of inches to convert to millimeters.");
		//instance of scanner to use in method
		Scanner sc = new Scanner(System.in);
		//int to represent users choice
		double Inches; 
		//taking user value and storing it in Inches 
		Inches = sc.nextDouble();
		//float to store decimal value in Millimeters
		double Millimeters = 25.4;
		
		//Printing out Inches of user choice and converting to millimeters
		
		System.out.println(Inches + " inches = " + Inches * Millimeters + " millimeters:");
	}

}
