#include <stdio.h>
#include <stdlib.h>
#include "funciones.h"


int main(int argc, const char *argv[]){

    int numero1 = 0, numero2 = 0;

    system("clear");
    printf("Escribe dos números: \n");

    printf("Numero 1-->  ");
    scanf(" %i",&numero1);

    printf("Numero 2-->  ");
    scanf(" %i",&numero2);

    printf("= %i\n",sumar(numero1,numero2));

    return EXIT_SUCCESS;
}
