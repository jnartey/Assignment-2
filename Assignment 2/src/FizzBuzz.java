/**
 * @author Jacob Nartey
 * 1. The Legendary FizzBuzz
 */
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {//Loop 
			
			//Condition to check if number is a multiple of 3 and 5
			if(i % 3 == 0 && i % 5 == 0) {
				//Print FizzBuzz
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0){//Condition to check if number is a multiple 5
				//Print Buzz
				System.out.println("Buzz");
			}else if(i % 3 == 0){//Condition to check if number is a multiple of 3
				//Print Fizz
				System.out.println("Fizz");
			}else {
				//Print integer if conditions above are not satisfied
				System.out.println(i);
			}
		}

	}

}
