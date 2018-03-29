/**
 * @author Students
 *
 */

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {
		String  message = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your message?");
		System.out.print("> ");
		
		message = input.nextLine();
		
		int messageLen = message.length() - 1;
				
		for(int i = 0; i <= messageLen; i++) {
			System.out.println(message.charAt(i));
		}
	}

}
