#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dlfcn.h>

void salir(const char *mssg){
	fprintf(stderr, "%s\n", mssg);
	exit(1);
}

void run(const char *mod_name, const char *funct_name){
	void *modulo = NULL;
	void (*fn)() = NULL;
	
	modulo = dlopen(mod_name, RTLD_LAZY);
	
	if(!modulo)
		salir("No se ha encontrao el modulo.");
		fn = (void (*)()) dlsym(modulo, funct_name);
		
	if(!fn)
	salir("No se ha encontrado la funcion.");
		(*fn)();
		
		dlclose(modulo);
}

int main(int argc, char *argv[]){

	run("./libhola.so", "greet");
	run("./libadios.so", "farewell");
	
	return EXIT_SUCCESS;
}
