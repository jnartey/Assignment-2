/**
 * @author jay
 * Create a program using nested loops that would generate the following output:
 */
public class NestedLoops {

	public static void main(String[] args) {
		//1.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(8);
			}
			System.out.println("");
		}
		
		System.out.println("\n");
		
		//2.
		int count = 4;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < count; j++) {
				System.out.print(8);
			}
			
			count--;
			System.out.println("");
		}
		
		System.out.println("\n");
		
		//2.
		int count_space = 5;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < count_space; j++) {
				System.out.print(" ");
			}
			
			count_space--;
			System.out.println(8);
		}
				
	}

}
