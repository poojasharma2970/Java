package WeekendAssignments;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = new int [] {24,53,56,32,33};
		System.out.println("The original array is: ");  
		for (int i = 0; i < arr.length; i++) {  
			System.out.println(arr[i]);
		}
		System.out.println(); 
		System.out.println("The Array in reverse order: ");
		
		for (int i = arr.length-1; i >= 0; i--) { 
			System.out.println(arr[i]);
		}
	}

}
	 