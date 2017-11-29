#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <getopt.h>
#include <dlfcn.h>

#define N 50 

sig_atomic_t hijos = 0;

void spawn(char buffer[N]){

	char *argv[N];
    int i = 0;
    pid_t hijo = 0;
	
	while(argv[i++] = strtok(buffer, " ") )
      buffer = NULL;

    strtok(argv[i-2], "\n");
 
    hijo = fork();
    if(hijo)
        return;

    execvp(argv[0],argv);
    fprintf(stderr,"No he podido ejecutar: %s \n ",argv[0]);
    exit(1);
}

void salidahijo(int signal){

		int salida;
		wait(&salida);
		hijos;
		
		if (WIFEXITED (salida))
			printf ("El hijo se salio.%d\n",
			WEXITSTATUS (salida));
		else
		printf ("No se ha salido.\n");
}

void iniciar(const char *nombre, const char *funcion){

    void *modulo = NULL;
    void (*fn)() = NULL;

    modulo = dlopen(nombre, RTLD_LAZY);

    if(!modulo)
        printf("No se ha encontrado el modulo");

    fn = (void (*)() ) dlsym(modulo, funcion);

    if(!fn)
        printf("No se ha encontrado la funcion");

    (*fn)();
    dlclose(modulo);
}

int
main (int argc, char *argv[])
{
	char buffer[N];
 	struct sigaction op;
 	bzero (&op, sizeof (op));
  	op.sa_handler = &salidahijo;
  	
	iniciar("./libllamar.so","leer_fichero");
	
	sigaction (SIGUSR1, &op, NULL);
	sigaction (SIGUSR2, &op, NULL);  	
	
	fgets(buffer, N, stdin);	
	spawn(buffer);
	
	return EXIT_SUCCESS;
	}
