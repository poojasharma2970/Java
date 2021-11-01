package ArrayHandsOn;
import java.util.Scanner;
import java.util.Arrays;

public class Occurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0 ; i < 10 ; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element whose occurence you want to know: ");
		int e = sc.nextInt();
		int occ=0;
		for(int i = 0; i< 10;i++) {
			if(e==arr[i]) {
				occ++;
			}
		}
		System.out.println(e+" occurred "+occ+ " times ");
	}

}


