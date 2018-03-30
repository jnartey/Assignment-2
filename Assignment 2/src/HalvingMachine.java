/**
 * @author Jacob Nartey
 * 2. The Halving Machine
 */

import java.util.Scanner;

public class HalvingMachine {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		//Prompt user
		System.out.println("Please enter an integer");
		System.out.print("> ");
		//Read input
		num = input.nextInt();
		
		if(num != 0) {//Condition to check if number is 0, if number is 0 end program
			while(num > 1) {//Loop if  number is greater than 1
				if(num % 2 == 0) {//Condition to check if integer is even
					//Divide integer by 2
					num = (num)/2;
					//Print result
					System.out.println(num);
				}else{
					//If integer is odd add 1 and divide by 2
					num = (num + 1)/2;
					//Print result
					System.out.println(num);
				}
			}
		}else {
			//Prompt user
			System.out.println("HEY! That's against the rules.");
			//End program
			input.close();
		}
	}

}
