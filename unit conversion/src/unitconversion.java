
import java.util.Scanner;

public class unitconversion
	{
		
		public static void main(String[] args)
		{
			double inputinches = inputinches(); 
			double inputfeet = inputfeet();//(user input inch convert to feet)
			double justinches = convertToJustinches(inputfeet,inputinches);
			double centimeters = convertToCentimeters(inputinches);
			double meters = convertToMeters(centimeters);
			double inches = convertToInches(inputfeet);
			double feet = convertToFeet(meters);
			}
		private static double inputinches()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please input the number in inches.");
			return userInput.nextDouble();
		}
		private static double inputfeet()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input the number in feet");
				return userInput.nextDouble();
			}
		private static double convertToJustinches(double numberOfinputfeet, double numberOfinputinches)
		{
			double justinches = (numberOfinputfeet*12) + (numberOfinputinches);
			System.out.println("equal to" + justinches + "justinches");
			return justinches;
		}
		
		private static double convertToCentimeters(double justInches)
		{
			double centimeters = justInches * 2.54;
			System.out.println("That equals " + centimeters + " centimeters.");
			return centimeters;
		}
		private static double convertToMeters(double centimeters)
		{
			double meters = centimeters * 0.01;
			System.out.println("That equals " + meters + " meters.");
			return meters;
		}
		private static double convertToFeet(double meters)
		{
			double feet = meters * 3.28;
			System.out.println("That equals " + feet + " feet.");
			return feet;
		}
	
	private static double convertToInches(double feet)
		{
			double inches = feet * 12;
			System.out.println("That equals " + inches + " inches.");
			return inches;
		}
		
	}