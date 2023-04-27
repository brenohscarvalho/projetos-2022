#include <stdio.h>
#include <stdlib.h>

int main()
{

    int valorInt;
    float valorReal;
    char letra, limpa;

    int i = 0;
    int *pontInt = &i;

    float f = 1.1;
    float *pontfloat = &f;

    char c = 'a';
    char *pontchar = &c;

    printf("Interio %i\n", i);
    printf("float: %f\n", f);
    printf("char: %c\n", c);

    printf("Digite um valor inteiro, real e um caracter.\n");
    scanf("%i%f%c%c", &valorInt, &valorReal, &limpa, &letra);
    printf("\n");
    
    *pontInt = valorInt;
    *pontfloat = valorReal;
    *pontchar = letra;

    printf("valor inteiro: %i\n", valorInt);
    printf("valor real: %f\n", valorReal);
    printf("caracter: %c", letra);

    return 0;
}