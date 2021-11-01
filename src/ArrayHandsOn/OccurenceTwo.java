package ArrayHandsOn;
import java.util.Scanner;
import java.util.Arrays;

public class OccurenceTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int occ[] = new int[10];
		int visited = -1;
		System.out.println("Enter the elements of the array : ");
		for(int i = 0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			int count =1;
			for (int j=i+1;j<10;j++) {
				if(arr[i]==arr[j]) {
					count++;
					occ[j]= visited;
				}
			}
			
			if(occ[i]!=visited) {
				arr[i]=count;
			}
		}
		
		for (int i=0;i<10;i++) {
			if(occ[i]!=visited) {
				System.out.println(arr[i]+ " | "+occ[i]);
			}
		}
	}

}

