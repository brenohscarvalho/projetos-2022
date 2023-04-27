#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n=10;
    int array [n];
    int i=0;
    int temp;
    array[0] = 10;
    array[1] = 5;
    array[2] = 7;
    array[3] = 4;
    array[4] = 1;
    array[5] = 3;
    array[6] = 9;
    array[7] = 8;
    array[8] = 2;
    array[9] = 6;

    for (int i = 1; i < n; i++) {
        int tmp = array [ i ];
        int j = i -1;

        while ((j>=0)&&(array[j]>tmp)) {
        array[j + 1] = array[ j ];
        j--;
        }

        array[j + 1] = tmp;
    }

    for(int k=0;k<n;k++){
        printf("%i ",array[k]);
    }
    printf("\n");
    for (int i = 1; i < n; i++) {
        int tmp = array [ i ];
        int j = i -1;

        while ((j>=0)&&(array[j]<tmp)) {
        array[j + 1] = array[ j ];
        j--;
        }

        array[j + 1] = tmp;
    }

    for(int k=0;k<n;k++){
        printf("%i ",array[k]);
    }

}
