#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    //trabalhando com arranjos em C

    int a[10];

    a[0] = 1;

    cout << a[0] << endl;

    int ai[5]={100,200,300,400,500};

    int matriz[2][3]={{10,20,30},{40,50,60}};

    cout << matriz[1][0] << endl;

    char palavraTeste[6] = "Teste";

    printf("O nome armazenado foi: %s \n", palavraTeste);

    //Percorrendo o vetor de char e mostrando cada elemento individualmente
    for (int i=0; i<5; i++)
        printf("Valor do elemento %d da string = %c\n",i, palavraTeste[i]);

    return 0;
}
