package handsOn;
import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		int fahr = temp.nextInt();
		int cel = 5 * (fahr-32) / 9;
		System.out.println("The temperature in degree celsius is: "+cel);

	}

}
