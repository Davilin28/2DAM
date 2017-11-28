void salir(const char *mssg){
    fprintf(stderr, "%s\n", mssg);
    exit(1);
}

void run (const char *mod_name, const char *funct_name){

    void *modulo = NULL;
    void (*fn)() = NULL; // Puntero a funcion

    modulo = dlopen(mod_name, RTLD_LAZY);

    if(!modulo)
        salir("No se ha encontrado el modulo");

    fn = (void (*)() ) dlsym(modulo, funct_name); // Busca funcion greet y pon un molde tipo void que no tiene parametros ni devuelve nada

    if(!fn)
        salir("No se ha encontrado la función");

    (*fn)();
    dlclose(modulo);
}

int main(int argc, char *argv[]){

    run("./libhola.so","saludar");
    run("./libadios.so","despedirse");

    return EXIT_SUCCESS;
}
