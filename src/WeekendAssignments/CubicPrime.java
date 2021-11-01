package WeekendAssignments;
import java.lang.Math;

public class CubicPrime {

	public static void main(String[] args) {
		int num  = 2;
		System.out.println("The Cube root for the first Prime Numbers are : ");
		System.out.println(2 + "="+ java.lang.Math.cbrt(2));
		for(int i =2; i<=11; i++) {
			if(i%2!=0) {
				System.out.println(i+" = "+java.lang.Math.cbrt(i));
			}
		}

	}

}


