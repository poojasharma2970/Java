package WeekendAssignments;

public class AsciiPyramid {

	public static void main(String[] args) {
		int a1 = 65;
		int a2 = 97;
		for(int i=0;i<=5;i++) {
			for(int j= a1-1; j>1;j--) {
				System.out.println(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print((char) (a1 + j) + " ");
			}
			System.out.println();

		}
		
	}

}


