
import java.util.Scanner;

public class Lab2 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String letter = null;

		do {
			System.out.println(
					"Welcome to Measurely: a measurement tool that helps find the length and width of classrooms within Grand Circus Detroit.");

			System.out.println("Go ahead... enter the length of the room you're in...");
			double length = input.nextDouble();

			System.out.println("Now it's time to enter the width of that same room...");
			double width = input.nextDouble();

			// Perimeter of area = length X width
			double area = length * width;

			// Perimeter of rectangle = 2 X (length X width)
			double perimeter = 2 * (length + width);

			System.out.println(" ");

			System.out.println("The area of the room that you're sitting in is: " + area);
			System.out.println("The perimeter of room that you're sitting in is: " + perimeter);

			System.out.println(" ");

			System.out.print("Would you like to continue? (y/n):");
			letter = input.next();

			System.out.println(" ");

		} while (letter.equalsIgnoreCase("Y"));
		input.close();
	}
}
