/**
 * @author Jacob Nartey
 * 3. Letter at a time
 */

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {
		String  message = "";
		Scanner input = new Scanner(System.in);
		
		//Prompt user and read input
		System.out.println("What is your message?");
		System.out.print("> ");
		
		message = input.nextLine();
		
		//Length of message
		int messageLen = message.length() - 1;
				
		for(int i = 0; i <= messageLen; i++) {
			//Print characters
			System.out.println(message.charAt(i));
		}
	}

}
