
public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Recorrer un array de enteros y sacar true si existe el numero 1, 
		//sacar false si no existe el numero 1.
		
		boolean encontrado = false;
	
		// Esto es un array de enteros en total hay 8 empezando a contar desde 0
			int [] enteros = {4, 5, 7, 10, 14, 9, 17, 2, 2};
			//			 i =  0, 1, 2,  3,  4, 5,  6, 7, 8
				
			for(int i=0; i<enteros.length && encontrado==false; i++) {
		
		//int numero = enteros[i];
					
			if(enteros[i] == 1){
			encontrado = true;
			System.out.println(encontrado);
			}
		}
			if(encontrado == false){
				System.out.println("No se ha encontrado ningun 1");
			}
	}
}