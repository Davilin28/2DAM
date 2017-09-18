
public class Actividad6 {

	public static void main(String[] args) {
		// Decir si un numero es Primo o no

		int numero = 7;
		boolean divisible = false;

		for (int i = 2; i < numero && divisible == false; i++) {
			if (numero % i == 0) {
				divisible = true;
			}
		}
		System.out.println(!divisible);
	}
}