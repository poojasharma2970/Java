package WeekendAssignments;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {23,54,24,-65,76,-41,21,86,43,96,33};
		Arrays.sort(arr);  
		System.out.println("The Second Largest Element in the Array is " + arr[arr.length-2]); 

	}

}
