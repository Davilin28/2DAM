import java.util.Scanner;

public class Actividad2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int opcion = 0;
		int n1 = 2, n2 = 4;
		int resultado;
		
		Scanner entrada=new Scanner(System.in);
		
		do{
			System.out.println("Menu Calculadora:");
			System.out.println("**************");
			System.out.println(" 1. Suma Dos Numeros");
			System.out.println(" 2. Restar Dos Numeros");
			System.out.println(" 3. Multiplicar Dos Numeros");
			System.out.println(" 4. Dividir Dos Numeros");
			System.out.println(" 5. Salir");
			System.out.print("Introduzca Opcion: ");
			
			opcion = entrada.nextInt();
			
			if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5){
				System.out.println("opcion no valida");
			}
			
			n1= entrada.nextInt();
			n2= entrada.nextInt();
			
			if(opcion == 1){
				resultado = sumar(n1,n2);
				System.out.println("El resultado es:"+resultado);
			}
			
			if(opcion == 2){
				resultado = restar(n1,n2);
				System.out.println("El resultado es:"+resultado);
			}
			
			if(opcion == 3){
				resultado = multiplicar(n1,n2);
				System.out.println("El resultado es:"+resultado);
			}
			
			if(opcion == 4){
				resultado = dividir(n1,n2);
				System.out.println("El resultado es:"+resultado);
			}
			
			if(opcion == 5){
				System.out.println("Hasta Pronto");
			}
			
		}while (opcion != 5);
			
		
	}

	private static int dividir(int n1, int n2) {
		// TODO Auto-generated method stub
		int resultado = n1/n2;
	
		return resultado;
	}

	private static int multiplicar(int n1, int n2) {
		// TODO Auto-generated method stub
		int resultado = n1*n2;
		
		return resultado;
	}

	private static int restar(int n1, int n2) {
		// TODO Auto-generated method stub
		int resultado = n1-n2;
		
		return resultado;
	}

	private static int sumar(int n1, int n2) {
		// TODO Auto-generated method stub
		int resultado = n1+n2;
		
		return resultado;
	}
}
