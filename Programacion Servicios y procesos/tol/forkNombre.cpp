#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#define ARCHIVO "poe.txt"
#define N 2


int main(int argc, char *argv[]){
	
	const char *nombres[] = {"ha\n","hola\n","adios\n", NULL};
	
    // The file pointer   
    FILE *file;
	
    // Open the file in write mode
    file = fopen(ARCHIVO, "w+");

    pid_t pid;
    pid=fork();
	
	if(pid != 0){
		for (int n=0; nombres[n]!=NULL; n++){
			fputs(nombres[n],file);
			fscanf(file, "%s", nombres[n]);
			printf("%i : %s\n", n, nombres[n]);	
		}
		
		fclose(file);
	}else{
		
	}
	
    return EXIT_SUCCESS;
}