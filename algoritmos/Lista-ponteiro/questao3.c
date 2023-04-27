#include <stdio.h>
#include <stdlib.h>

void preenche(int *vet, int n);

int main()
{
    int n;
    int *vetpont;

    printf("digite o tamanho do vetor: ");
    scanf("%i", &n);
    vetpont = malloc(sizeof(int) * n);

    preenche(vetpont, n);

    for (int j = 0; j < n; j++)
    {
        printf("%d ", vetpont[j]);
    }
    free(vetpont);
    return (0);
}
void preenche(int *vet, int i)
{

    for (int j = 0; j < i; j++)
    {
        printf("%d: ", j);
        scanf("%d", &vet[j]);
    }
}