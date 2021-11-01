package WeekendAssignments;
import java.util.Scanner;

public class SumOfDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,sum=0; 
		int[][] matrix = new int[3][3];
		System.out.println("Enter the elements of the matrix") ;
		for(i=0;i<3;i++){ 
        	for(j=0;j<3;j++){ 
        		matrix[i][j] = sc.nextInt();
        	}
        }
		System.out.println("The elements of the matrix") ;
		
		for(i=0;i<3;i++){ 
        	for(j=0;j<3;j++){ 
        		System.out.print(matrix[i][j]+"\t");
        	}
        	System.out.println("");
        }
		for(i=0;i<3;i++){ 
        	for(j=0;j<3;j++) { 
        		if(i==j) // checks diagonal
        		{
        			sum = sum + matrix[i][j];
        		}
        	}
        }
		System.out.printf("Sum of Diagonal elements of the matrix = "+sum) ;
	}

}

       
        
        

        
   