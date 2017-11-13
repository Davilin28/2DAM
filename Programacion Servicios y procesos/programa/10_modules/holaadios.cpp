#include<stdio.h>
#include<stdlib.h>
#include<unistd.h> // Libreria para hilos.
#include<dlfcn.h> // Libreria para dlopen.

void salir(const char *mssg){
	fprintf(stderr, "%s\n", mssg);
	exit(1);
}

void run(const char *mod_name, const char *funct_name){
	void *modulo = NULL;// Puntero llamado modulo
	void (*fn)() = NULL; // Declaramos un puntero a una funcion 
	
	//Con dlopen abrimos una libreria, read time load(RTLD).
	modulo = dlopen(mod_name, RTLD_LAZY);
	
	// Proceso de carga. Buscamos el simbolo dentro de modulo que es un puntero que apunta a la libreria
	// libhola.so que tiene una funcion llamada greet.
	// El molde convierte el dlsym a un puntero que no devuelve nada.
	
	if(!modulo)
		salir("No se ha encontrado el modulo.");
	fn = (void (*)()) dlsym(modulo, funct_name);
	
	if(!fn)
		salir("No se ha encontrado la funcion.");
	(*fn)();
	
	// Cerramos la libreria.
	dlclose(modulo);
}

int
main(int argc, char *argv[])
{
	run("./libhola.so", "greet");
	run("./libadios.so", "farewell");
	
	return EXIT_SUCCESS;
}
