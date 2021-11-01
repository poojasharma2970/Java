package handsOn;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		int sum = 0 ;
		while(num!=0) {
			int d = num % 10;
			sum = sum + d;
			num = num /10;
		}
		System.out.print("The sum of the digits of the number is : "+sum);

	}

}
