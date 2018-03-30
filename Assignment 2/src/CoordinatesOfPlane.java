/**
 * @author Jacob Nartey
 * 4. Coordinates in a plane
 */

import java.util.Scanner;

public class CoordinatesOfPlane {

	public static void main(String[] args) {
		
		int x = 0, y = 0;
		Scanner reader = new Scanner(System.in);
		
		//Prompt user
		System.out.println("This program takes two integers: [x] and [y].");
		//Prompt user for maximum input of x
		System.out.println("What is the maximum x?");
		System.out.print("> ");
		//Read input x
		x = reader.nextInt();
		//Prompt user for maximum input of 7
		System.out.println("What is the maximum y?");
		System.out.print("> ");
		//Read input y
		y = reader.nextInt();
		
		for(int i = 0; i <= x; i++) {//Rows
			for(int j = 0; j <= y; j++) {//Columns
				
				//Print coordinates x and y
				System.out.println("(" + i + "," + j + ")");
			}
		}
	}

}
