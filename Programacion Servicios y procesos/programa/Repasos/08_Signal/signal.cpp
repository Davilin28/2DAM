#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <unistd.h>
#include <signal.h>

sig_atomic_t contador = 0;

void handler(int signal_number)
{
    ++contador;
}

int main()
{
    struct sigaction sa;
    memset(&sa, 0, sizeof(sa));
    /* memset() rellena los primeros n bytes(3º) del área de memoria apuntada por s(*1º) con el byte constante c (2º)*/
    sa.sa_handler = &handler;
    sigaction(SIGUSR1, &sa, NULL);

    printf("SIGUSR1 was raised %i times.\n", contador);

    return EXIT_SUCCESS;
}

