package WeekendAssignments;
import java.util.Scanner;

public class FindValueFromArray {

	public static void main(String[] args) {
		int[] arr = {121, 32, 33, 40, 25, 96, 65, 18, 45, 90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of the element to find in Array: ");
		int n = sc.nextInt();
		boolean found = false;
		for(int i: arr ) {
			if(i==n) {
				found = true;
				break;
			}
		}
		
		if(found == true) {
			System.out.print(n+" is found");
		}else {
			System.out.print(n+" is not found");
		}
		
	}

}	    
