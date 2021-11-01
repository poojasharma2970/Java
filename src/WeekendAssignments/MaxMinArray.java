package WeekendAssignments;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] n = {1,5,3,9,2,-6,3,25,7,2};
		Arrays.sort(n);
		System.out.println("Minimum Element of Array: "+n[0]);
		System.out.println("Maximum Element of Array: "+n[n.length-1]);
		

	}

}

