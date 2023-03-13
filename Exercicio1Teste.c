#include <stdio.h>

int main()
{
    printf("=====================================================\n");

    int INDICE = 13, SOMA = 0, K = 0;

    while (K < INDICE){

        K = K + 1;

        SOMA = SOMA + K;
    }

    printf("O Valor da Soma = [%d]",SOMA);

    printf("\n=====================================================\n");
    return 0;
}