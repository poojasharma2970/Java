package handsOn;

public class PaisaConversion {

	public static void main(String[] args) {
		double d = 73.45;
		System.out.println("The price of an item before was " +d+ " rs");
		long i= Math.round(d *100);
		System.out.println("The price of an item is now "+i+" paise");

	}

}

