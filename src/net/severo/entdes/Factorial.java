package net.severo.entdes;
/**
 * 
 * @author Jorge F. Bernal Alcocer
 *
 */
public class Factorial {

	private static final String VALUE_OF_N2 = "Numeron a!: ";
	private static final String VALUE_OF_N = "Numeron a: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(VALUE_OF_N + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(VALUE_OF_N2 + result);

	}

}
