/**
 * @author Jacob Nartey
 *
 */
public class EvenNumbers {
	public static void main(String[] args) {
		//Incrementing 2 in each step (use "continue" to skip 16) 
		for(int i = 10; i <= 20; i += 2) {
			
			if(i == 16) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("");
		
		//Incrementing 1 in each step (use "continue")
		for(int i = 10; i <= 20; i++) {
			
			if(i == 16) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("");
		
		//With and endless loop (using "break" & "continue") 
		int count = 10;
		
		while(true) {
			
			if(count == 16) continue;
			System.out.println(count);
			if(count == 20) break;
			
			count++;
		}
	}

}
