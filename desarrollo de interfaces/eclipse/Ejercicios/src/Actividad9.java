
public class Actividad9 {

	static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = factorial(3);

		System.out.println("El factorial es: " + resultado);
	}
}