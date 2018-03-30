/**
 * @author jay
 * Create a program using nested loops that would generate the following output:
 */
public class NestedLoops {

	public static void main(String[] args) {
		//1.
		for(int i = 0; i < 5; i++) {//Print rows of 5
			for(int j = 0; j < 8; j++) {//Print columns of 8
				//Print number 8
				System.out.print(8);
			}
			
			//Print next line
			System.out.println("");
		}
		
		//Print 
		System.out.println("\n");
		
		//2.
		int count = 4;
		
		for(int i = 0; i < 4; i++) {//Print rows of 4
			for(int j = 0; j < count; j++) {//Print columns in descending order
				//Print number 8
				System.out.print(8);
			}
			
			count--;
			System.out.println("");
		}
		
		System.out.println("\n");
		
		//2.
		int count_space = 5;
		
		for(int i = 0; i < 6; i++) {//Print columns of 6
			for(int j = 0; j < count_space; j++) {//Print rows of spaces 5 in descending
				//Print spaces
				System.out.print(" ");
			}
			
			//Decreasing counter
			count_space--;
			
			//Print number 8
			System.out.println(8);
		}
				
	}

}
