import java.util.Scanner;

public class LlamarDni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Introduce DNI sin letra: ");
		Scanner leer = new Scanner(System.in);
		int dni = Integer.parseInt(leer.next());
		int index = dni - (Math.abs(dni / 23) * 23);
		System.out.println("Su letra de DNI es: " + letras.charAt(index));
		System.out.println("Su DNI es: " + dni + "-" + letras.charAt(index));
	}

}
