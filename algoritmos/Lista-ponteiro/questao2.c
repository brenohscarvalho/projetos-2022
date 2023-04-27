#include <stdio.h>
#include <stdlib.h>

int main(){

int num1;
int num2;

printf("preencha valor 1\n");
scanf("%i", &num1);

printf("preencha valor 2\n");
scanf("%i", &num2);

int*pontnum1 = &num1;
int*pontnum2 = &num2;

if (&pontnum1>&pontnum2){
printf("o maior endereco: ");
printf("%i", *pontnum1);
}
else {
    printf("o maior endereco: ");
    printf("%i", *pontnum2);
}

return 0;
}