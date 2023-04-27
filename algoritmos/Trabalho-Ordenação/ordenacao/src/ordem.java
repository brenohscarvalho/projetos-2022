import java.util.Scanner;
import java.io.*;
//bubbleSort
public class ordem {
    public static String[] bubbleSort(String[] copia) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < copia.length; i++) {
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[i].toUpperCase().compareTo(copia[j].toUpperCase()) > 0) {
                    String aux = copia[i];
                    copia[i] = copia[j];
                    copia[j] = aux;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de bubbleSort: " + tempototal + "ms");
        return (copia);
    }


//selectionSort
    public static String[] selectionSort(String[] copia) {
        long tempoinicial = System.currentTimeMillis();
        for (int j = 0; j < copia.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < copia.length; k++)
                if ((copia[k].toUpperCase()).compareTo(copia[min].toUpperCase()) < 0)
                    min = k;
            String temp = copia[j];
            copia[j] = copia[min];
            copia[min] = temp;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de selectionSort: " + tempototal + "ms");
        return (copia);
    }


    //insertionSort
    public static String[] insertionSort(String[] copia) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 1; i < copia.length; i++) {
            String tmp = copia[i];
            int j = i - 1;
            while ((j >= 0) && (tmp.toUpperCase().compareTo(copia[j].toUpperCase()) < 0)) {
                copia[j + 1] = copia[j];
                j--;
            }
            copia[j + 1] = tmp;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de insertionSort: " + tempototal + "ms");
        return copia;
    }


    //heapSort
    public static String[] heapSort(String[] copia, int N, int i) {
        long tempoinicial = System.currentTimeMillis();
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < N && (copia[esq].toUpperCase().compareTo(copia[maior].toUpperCase()) < 0))
            maior = esq;

        if (dir < N && (copia[esq].toUpperCase().compareTo(copia[maior].toUpperCase()) < 0))
            maior = dir;

        if (maior != i) {
            String swap = copia[i];
            copia[i] = copia[maior];
            copia[maior] = swap;
            heapSort(copia, N, maior);
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de HeapSort: " + tempototal + "ms");
        return (copia);
    }


    //mergeSort
    public static String[] mergeSort(String[] copia, int esqerda, int mid, int direita) {
        long tempoinicial = System.currentTimeMillis();
        String[] aux = new String[copia.length];
        for (int i = esqerda; i <= direita; i++) {
            aux[i] = copia[i];
        }
        int i = esqerda;
        int j = mid + 1;
        int k = esqerda;

        while (i <= mid && j <= direita) {
            if (aux[i].toUpperCase().compareTo(aux[j].toUpperCase()) < 0) {
                copia[k] = aux[i];
                i++;
            } else {
                copia[k] = aux[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            copia[k] = aux[i];
            i++;
            k++;
        }
        while (j <= direita) {
            copia[k] = aux[j];
            j++;
            k++;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de mergeSort: " + tempototal + "ms");
        return copia;
    }

    public static void troca(String vet[],int esq, int dir) {
		String aux;
		aux = vet[esq];
		vet[esq] = vet[dir];
		vet[dir]=aux;
	}
    public static int particao(String[] copia, int esq, int dir) {
        int range = dir - esq + 1;
        int pivotIndex = (int)(Math.random() * range) + esq;
        troca(copia, esq, pivotIndex);

        String pivot = copia[esq];
        int i = esq;

        for (int j = esq + 1; j <= dir; j++) {
            if ((copia[j].toUpperCase()).compareTo(pivot.toUpperCase())<0) {
                
                i+=1;
                troca(copia, i, j);
            }
        }
        troca(copia, esq, i);
        
        return i; 
    }
    
    
    //quickSort
    public static String[] quickSort(String[] v, int esq, int dir) {
        long tempoinicial = System.currentTimeMillis();
        if (esq < dir) {
            int index_pivot = particao(v, esq, dir);
            quickSort(v, esq, index_pivot - 1);
            quickSort(v, index_pivot + 1, dir);
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");
        return v;
    }

    public static void main(String[] args) {

        try {
            File arquivo = new File("C://Users/breno/Desktop/TrabalhoOrdenação/nomes.txt");
            Scanner ler = new Scanner(arquivo);
            String linha = "";
            int cont = 0;

            while (ler.hasNext()) {
                linha += ler.nextLine();
                cont++;
            }

            String vetFrase[] = new String[cont];
            vetFrase = linha.split(";");

            String vetbolha[] = bubbleSort(vetFrase);
            for (int i = 0; i < vetbolha.length; i++) {
                System.out.println(vetbolha[i] + "");
            }

            System.out.println("----------------------");

            String vetselecao[] = selectionSort(vetFrase);
            for (int i = 0; i < vetselecao.length; i++) {
                ;
                System.out.println(vetselecao[i] + "");
            }
            System.out.println("----------------------");

            String vetInsercao[] = insertionSort(vetFrase);
            for (int i = 0; i < vetInsercao.length; i++) {
                System.out.println(vetInsercao[i] + "");
            }
            System.out.println("----------------------");
            String vetheapsort[] = heapSort(vetFrase, vetFrase.length, vetFrase.length / 2);
            for (int i = 0; i < vetheapsort.length; i++) {
                System.out.println(vetheapsort[i] + "");
            }

            System.out.println("----------------------");
            String vetMerge[] = mergeSort(vetFrase, 0, vetFrase.length / 2, vetFrase.length - 1);
            for (int i = 0; i < vetMerge.length; i++) {
                System.out.println(vetMerge[i] + "");
            }
            System.out.println("----------------------");

            String vetQuick[] = quickSort(vetFrase,0,vetFrase.length-1);
            for (int i = 0; i < vetQuick.length; i++) {
                System.out.println(vetQuick[i] + "");
            }
            System.out.println("----------------------");
            ler.close();
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
