/**
 * @author Jacob Nartey
 * Simple expressions
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleExpressions {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//Creating and initializing variables
		String expression = "";
		int count = 0;
		String firstNum = "";
		String operator = "";
		String secondNum = "";
		double cal = 0;
		int checkFirst = 0;
		
		//Prompt user
		System.out.println("Enter a simple math expression example \" 17 + 3\" or 0 to quit program");
		
		do {
			//Initialize count
			count = 0;
			
			System.out.print("> ");
			
			//Read input
			expression = reader.nextLine();
			//Get first character and convert to number
			checkFirst = Character.getNumericValue(expression.charAt(0));
			
			//Instantiate StringTokenizer class and token string
			StringTokenizer tokenizeExpression = new StringTokenizer(expression);
			
			//count string token
			int tokenCount = tokenizeExpression.countTokens();
			
			//condition to check if tokens are less than 3 and if input is not 0
			if(tokenCount != 3 && checkFirst != 0) {
				//Prompt user if conditions above are satisfied and break from loop
				System.out.println("Invalid Expression quiting program");
				break;
			}
			
			if(checkFirst != 0) {
				while(count < tokenCount + 1) {//loop to collect tokens
					if(count == 1) {
						//Get first number
						firstNum = tokenizeExpression.nextToken();
					}
					
					if(count == 2) {
						//Get Operator
						operator = tokenizeExpression.nextToken();
					}
					
					if(count == 3) {
						//Get second number
						secondNum = tokenizeExpression.nextToken();
					}
					
					count++;
				}
				
				//Converting to double
				double dFirstNum = Double.parseDouble(firstNum);
				double dSecondNum = Double.parseDouble(secondNum);
				
				//Switch case condition for basic arithmetic operations
				switch(operator) {
					case "+":
						cal = dFirstNum + dSecondNum;
						break;
					case "-":
						cal = dFirstNum - dSecondNum;
						break;
					case "*":
						cal = dFirstNum * dSecondNum;
						break;
					case "/":
						cal = dFirstNum / dSecondNum;
						break;
					default:
						System.out.println("Invalid operator");
						break;
				}
				
				//Print value
				System.out.println("  " + cal);
			}
			
		}while(checkFirst != 0);
		
		//End program block
		System.out.println("Program ended...");
		reader.close();
	}

}
