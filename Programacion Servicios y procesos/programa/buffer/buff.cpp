#include <stdio.h>
#include <stdlib.h>
#include <stdio_ext.h>

#define N 6


struct TQueue {
    int buffer[N];
    int summit;
    unsigned char c;
};

struct TQueue buffer;

bool push(struct TQueue *p, unsigned char c) {
    if (p->summit >= N)
        return false;
    p->buffer[p->summit++] = c;
        return true;
}

int pop(struct TQueue *p){
    if (p->summit <= 0)
        return -666;
    return p->buffer[--p->summit];
}

void imprimir(struct TQueue buffer) {
    for (int i=0; i<buffer.summit; i++)
        printf(" %i", buffer.buffer[i]);
    printf("\n");
}

int main(int argc, char *argv[]){

    int dato;
    int cantidad;

    buffer.summit = 0;

    do {
        printf("Numero: ");
        __fpurge(stdin);
        cantidad = scanf("%i", &dato);

        if (cantidad){
            push(&buffer, dato);
            imprimir(buffer);
        } else
            printf(" %i\n", pop(&buffer));

} while(1);

return EXIT_SUCCESS;

}
