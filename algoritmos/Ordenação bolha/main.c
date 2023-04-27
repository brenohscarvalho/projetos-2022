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


    for(int i = (10-1);i > 0;i--){
        for(int j = 0;j < i;j++){
            if(array[j] < array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    printf("\n");
    for(i=0;i<n;i++){
        printf("%i ",array[i]);
    }

    for(int i = (10-1);i > 0;i--){
        for(int j = 0;j < i;j++){
            if(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    printf("\n");
    for(i=0;i<n;i++){
        printf("%i ",array[i]);
    }
}
