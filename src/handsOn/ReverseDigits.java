package handsOn;
import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = num.nextInt();
		int rev = 0;
		while(n!=0) {
			int remain = n % 10;
			rev = rev * 10 + remain;
			n = n /10;
		}
		
		System.out.println("The reverse of the given number is : " +rev);

	}

}
