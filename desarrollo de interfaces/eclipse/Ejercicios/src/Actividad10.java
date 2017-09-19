
public class Actividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 127;
		String binario = "";

		do {
			binario += numero % 2;
			numero /= 2;
		} while (numero > 0);

		for (int i = binario.length() - 1; i >= 0; i--)
			System.out.print(binario.charAt(i));

	}
}