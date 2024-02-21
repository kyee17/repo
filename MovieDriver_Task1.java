/*
 * Class: CMSC203 CRN 34473
 * Program: Lab 1 Task 1
 * Instructor: Khandan Monshi
 * Summary of Description: User enters a movie name, rating and tickets sold.
 * Due Fate: 02/21/2024
 * Integrity Pledge: I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
*/
import java.util.Scanner;

public class MovieDriver_Task1 
{
	public static void main(String [] args)
	{
		
		Scanner keyboard =new Scanner(System.in);
		Movie m = new Movie();
		System.out.println("Enter the name of a movie:");
		m.setTitle(keyboard.nextLine());
		
		System.out.println("Enter the rating of a movie:");
		m.setRating(keyboard.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie:");
		m.setSoldTickets(keyboard.nextInt());
		
		System.out.println(m.toString());
		
	}
}