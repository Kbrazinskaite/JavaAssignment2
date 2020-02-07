package com.qa.infiniteterrainsystem;

import java.util.Scanner;

public class Runner{
	
	public static void main(String[]args) {
		
		//Player_Game  a = new Player_Game();
		//a.getDirections(2);
		
		Scanner input = new Scanner (System.in);
		
		String Player_Name;
		int north_Dial, south_Dial, east_Dial, west_Dial;
		int destination1, destination2, destination3, destination4, final_destination;
		
		System.out.println("Please enter your name: ");
		Player_Name = input.nextLine();
		
		System.out.println("Please enter North dial: ");
		north_Dial = input.nextInt();
		
		System.out.println("Please enter South dial: ");
		south_Dial = input.nextInt();
		
		System.out.println("Please enter East dial: ");
		east_Dial = input.nextInt();
		
		System.out.println("Please enter West dial: ");
		west_Dial = input.nextInt();
		
		destination1 = (north_Dial * north_Dial) + (east_Dial * east_Dial);
		destination2 = (north_Dial * north_Dial) + (west_Dial * west_Dial);
		
		destination3 = (south_Dial * south_Dial) + (east_Dial * east_Dial);
		destination4 = (south_Dial * south_Dial) + (west_Dial * west_Dial);
		
		final_destination = destination1 + destination2 + destination1 + destination2;
		
		System.out.println("Hello " + Player_Name + ", welcome to infinite grey swamp adventure " + " you entered: " + north_Dial
				+ " dial of North, " + south_Dial + " dial of South, " + east_Dial
				+ " dial of East, " +  west_Dial + " dial of West. " + " You reached your final destination, congradulations you won our treassure!");
	}

}
