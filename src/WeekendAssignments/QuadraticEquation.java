package WeekendAssignments;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c : ");
		double c = sc.nextDouble();
	
		double d  = b*b - 4*a*c;
		
		if(d>0) {
			double root1 = (-b + Math.pow(d, 0.5))/(2*a);
			double root2 = (-b - Math.pow(d, 0.5))/(2*a);
			System.out.println("The roots of the equation are : " + root1 + " and " + root2); 
		}else if(d==0) {
			double root1 = -b/(2*a);
			System.out.println("The roots of the equation is : " + root1); 
		}else {
			System.out.println("The roots are not real"); 
		}
		

	}

}
