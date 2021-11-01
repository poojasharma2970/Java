package WeekendAssignments;
import java.util.Random;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println("The random number is : "+num);
//		int num = 153;
		int temp, dig=0, sum=0,last = 0;
		temp = num;
		while(temp !=  0) {
			temp = temp /10;
			dig++;
		}
		temp = num;
		while(temp!=0) {
			last = temp%10;
			sum += (Math.pow(last, dig));
			temp = temp/10;   
		}
		
		if(num==sum) {
			System.out.println("The Number is an armstrong number");
		}else {
			System.out.println("The Number is not an armstrong number");
		}

	}

}
