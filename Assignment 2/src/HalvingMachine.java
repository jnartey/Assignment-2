/**
 * @author Jacob Nartey
 * 2. The Halving Machine
 */

import java.util.Scanner;

public class HalvingMachine {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer");
		System.out.print("> ");
		
		num = input.nextInt();
		
		if(num != 0) {
			while(num > 1) {
				if(num % 2 == 0) {
					num = (num)/2;
					System.out.println(num);
				}else{
					num = (num + 1)/2;
					System.out.println(num);
				}
			}
		}else {
			System.out.println("HEY! That's against the rules.");
			input.close();
		}
	}

}
