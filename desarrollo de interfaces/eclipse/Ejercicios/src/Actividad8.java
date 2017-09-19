
public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 2, 2, 3 }, { 4, 4, 5 }, { 6, 7, 8 } };
		int resultado = 0;

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				resultado += matriz[i][j];
		System.out.println(resultado);
	}
}