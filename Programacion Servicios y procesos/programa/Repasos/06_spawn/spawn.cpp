#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <string.h>

#define N 0x100
#define PROMPT "MA-TEOS $>"
#define M 0x10 //16

void spawn(char buffer[N]){

    char *argv[M];
    int i = 0;
    pid_t mihijo = 0;

    while(argv[i++] = strtok(buffer, " ") )
      buffer = NULL;

    strtok(argv[i-2], "\n"); // Quitar error \n  // Ponemos -2 porque -1 es un null y pone \n 
 
    mihijo = fork();
    if(mihijo)
        return;

    //execv("usr/bin/firefox",["firefox","index.html","NULL"]);
    execvp(argv[0],argv); // wich firefox te dice la ruta
    fprintf(stderr,"No he podido ejecutar: %s \n ",argv[0]);
    exit(1);
}


int main(int argc, char *argv[]){

    char buffer[N];

    while(1){

    printf(PROMPT);
    fgets(buffer, N,stdin);       //Lee una linea entera asta su fichero -> direccion memoria, cuantos bits, fichero que quieres leer
    spawn(buffer);                 //Lanzar lo que haya en el buffer


    }
    return EXIT_SUCCESS;
}

