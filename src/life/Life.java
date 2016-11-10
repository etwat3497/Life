/*
 * Life.java
 * Chapter 10 Exercise 14
 */
 package life;
 import java.util.Scanner;
 
 /**
  * The Game of Life
  */
 public class Life {

	public static void main(String[] args) {
		LifeWorld newWorld = new LifeWorld(20, 20);
		Scanner input = new Scanner(System.in);
		String response;
		int days = 1;
		
		newWorld.populateWorld();
		newWorld.showWorld();
		System.out.print("Enter n for next day or q for quit: ");
		response = input.nextLine();
		while (response.equalsIgnoreCase("n")) {
			days += 1;
			System.out.println("Day " + days + ":");
			newWorld.nextDay();
			newWorld.showWorld();
			System.out.print("Enter n for next day or q for quit: ");
			response = input.nextLine();
		}
	}
}
