/**
 * @author Jacob Nartey
 *
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class SimpleExpressions {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String expression = "";
		int count = 0;
		String firstNum = "";
		String operator = "";
		String secondNum = "";
		double cal = 0;
		int checkFirst = 0;
		
		System.out.println("Enter a simple math expression example \" 17 + 3\" or 0 to quit program");
		
		do {
			
			count = 0;
			
			System.out.print("> ");
			expression = reader.nextLine();
			
			checkFirst = Character.getNumericValue(expression.charAt(0));
			
			StringTokenizer tokenizeExpression = new StringTokenizer(expression);
			int tokenCount = tokenizeExpression.countTokens();
			
			if(tokenCount != 3 && checkFirst != 0) {
				System.out.println("Invalid Expression quiting program");
				break;
			}
			
			if(checkFirst != 0) {
				while(count < tokenCount + 1) {
					if(count == 1) {
						firstNum = tokenizeExpression.nextToken();
					}
					
					if(count == 2) {
						operator = tokenizeExpression.nextToken();
					}
					
					if(count == 3) {
						secondNum = tokenizeExpression.nextToken();
					}
					
					count++;
				}
				
				double dFirstNum = Double.parseDouble(firstNum);
				double dSecondNum = Double.parseDouble(secondNum);
							
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
				
				System.out.println("  " + cal);
			}
			
		}while(checkFirst != 0);
			
		System.out.println("Program ended...");
		reader.close();
	}

}
