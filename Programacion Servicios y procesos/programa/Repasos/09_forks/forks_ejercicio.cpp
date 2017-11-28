#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
int main()
{
    int status;
    int contador; // Creamos un contador.
                  // Paracontrolar los hilos que queremos crear
    for(contador = 0; contador < 5; contador++){ // Para crear 10 y el padre

        if(fork()==0){//Creamos
          printf("Procesos creados \n ");
          printf("PID del HIJO %i proceso = %i Pid Padre = %i \n \t",getpid(),contador,getpid());
        }else{ // Si lo devuelve el fork(distinto de 0

          wait(&status);// esperamos a que termine el hijo
          printf("################################ \n ");
          printf("Procesos terminados:  \n ");
          printf("PID del Hijo %i = %i Pid padre = %i \n \t",getpid(),contador,getpid());

          exit(0); // Elimina
        }

    }

}
