/**
 * @author Jacob Nartey
 * 4. Coordinates in a plane
 */

import java.util.Scanner;

public class CoordinatesOfPlane {

	public static void main(String[] args) {
		
		int x = 0, y = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("This program takes two integers: [x] and [y].");
		System.out.println("What is the maximum x?");
		System.out.print("> ");
		x = reader.nextInt();
		
		System.out.println("What is the maximum y?");
		System.out.print("> ");
		y = reader.nextInt();
		
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= y; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
	}

}
