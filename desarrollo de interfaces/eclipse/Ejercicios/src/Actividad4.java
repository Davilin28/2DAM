
public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Recorrer un array de enteros y dar una cantidad total de numeros pares.
		// Contador es para almacenar los numeros pares.
		int contador = 0;
		
		// Esto es un array de enteros en total hay 8 empezando a contar desde 0
		int [] enteros = {4, 5, 7, 10, 14, 9, 17, 2, 1};
		//			 i =  0, 1, 2,  3,  4, 5,  6, 7, 8
		
		for(int i=0; i<=enteros.length-1; i++) {
			
			//int numero = enteros[i];
			
			if(enteros[i]%2 == 0){
				contador ++;
			}
		}
		
		//Esto es como un printf en c
		System.out.println("El resultado es: " +contador);
	}
}
