package WeekendAssignments;
import java.util.Random;

public class RandomPrimeNumber {

	public static void main(String[] args) {
		Random random = new Random();   
		int num = random.nextInt(100000);
		System.out.println("The random number is : "+num);
		boolean isPrime = true;
		int n =num;
		for(int i =2; i< n; i++) {
			if(n %i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime==true) {
			System.out.println("The number "+num+" is a Prime Number");
		}else {
			System.out.println("The number "+num+" is not a Prime Number");
		}
	}

}
