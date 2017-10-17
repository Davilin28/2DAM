#include <stdio.h>
#include <stdlib.h>

//Definimos lo que vale N

#define N 5
#define LONGITUD(x) ((x)->summit - (x)->head)

//Crear un buffer circular, nos piden que con un push y un pop intentemos lo siguiente:
// 1. Crear una estructura con los atributos necesarios.
// 2. Crear las funciones necesarias para nuestro desarrollo.
// 3. Llamar a nuestras funciones dentro del main.
// 4. Comprobar.


struct TContenedor 
{
	int data[N];
	int head;
	int summit;
};

bool push(struct TContenedor *b, int d)
{
	if (LONGITUD(b) >= N) // Si longitud de b es mayor o igual a N (FALSO)
		return false;
		
    b->data[(b->summit) % N] = d;  // B apunta a lo que contenga data[ b apunta a summit] y le resta N
    b->summit++;
		return true;
}

int pop(struct TContenedor *b)
{
	if (LONGITUD(b) == 0) // Si longitud es igual a 0 (FALSO)
		return 666;
    int d = b->data[(b->head) % N]; //guarda en d lo que contenga data [b apunta a la cabecera] y le resta N
    b->head++;
		return d;
}

void imprime(struct TContenedor b)
{
	for(int i=b.head; i<b.summit; i++) // Inicializa i en b.head(donde este hubicada la cabecera al principio), i menor que summit.
	printf("%3i ", b.data[i%N]); // sacar por pantalla los datos que tenga el buffer.
   printf("\n");
}


int main (int argc, char *argv[]){
	
    struct TContenedor buffer; // llamada al constructor 
    buffer.head = 0; // inicializamos a cero la cabecera
    buffer.summit = 0; // inicializamos a cero la cola.

    push(&buffer, 3);
    push(&buffer, 5);
    push(&buffer, 7);
	pop(&buffer);
	push(&buffer, 3);
    push(&buffer, 5);
    push(&buffer, 7);
 
    imprime(buffer);
	

return EXIT_SUCCESS;
}
