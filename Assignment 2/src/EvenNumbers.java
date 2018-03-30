/**
 * @author Jacob Nartey
 * 5. Create a JAVA program to write the even numbers from 10 to 20, both included, except 16, in 3 different ways: 
 */
public class EvenNumbers {
	public static void main(String[] args) {
		//Incrementing 2 in each step (use "continue" to skip 16) 
		for(int i = 10; i <= 20; i += 2) {
			//Skip the number 16
			if(i == 16) {
				continue;
			}
			
			//Print integers
			System.out.println(i);
		}
		
		System.out.println("");
		
		//Incrementing 1 in each step (use "continue")
		for(int i = 10; i <= 20; i++) {
			
			//Skip the number 16
			if(i == 16) {
				continue;
			}
			
			//Print integers
			System.out.println(i);
		}
		
		System.out.println("");
		
		//With and endless loop (using "break" & "continue") 
		int count = 10;
		
		while(true) {
			//Skip the number 16
			if(count == 16) { count++; continue;}
			System.out.println(count);
			
			//Break from loop if counter reached 20
			if(count == 20) break;
			
			//Increment counter
			count++;
		}
	}

}
