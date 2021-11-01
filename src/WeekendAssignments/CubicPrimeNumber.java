package WeekendAssignments;

public class CubicPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Cube root for first 5 prime numbers are:");  
		int ct=0,n=0,i=1,j=1;  
		while(n<5)  {  
			j=1;  
			ct=0;  
			while(j<=i){  
				if(i%j==0)  
					ct++;  
					j++;   
				}  
				if(ct==2){  
					System.out.println(i+" = "+java.lang.Math.cbrt(i));  
					n++;  
				}  
				i++;  
			}

		}
}


