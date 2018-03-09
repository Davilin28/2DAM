#include <pthread.h>
#include <stdio.h>

struct TArgumento {
    int argumento1;
    double argumento2;
};

void *funcion_hilo(void *parametro) {
    struct TArgumento *p_args = (struct TArgumento *) parametro;
    struct TArgumento arg = *p_args;
}

int main ()
{
	struct TArgumento llamada_args = {2, 3.5};
	pthread_t thread_id;
	pthread_create(&thread_id, NULL, funcion_hilo, (void *) &llamada_args);

	return 0;
}
