import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ordem2 {
   public static int[] QuickSort(int[] values, int left, int right) {
      if (left < right) {
         int index_pivot = partition(values, left, right);
         QuickSort(values, left, index_pivot - 1);
         QuickSort(values, index_pivot + 1, right);
      }
      return values;
   }

   public static int partition(int[] values, int left, int right) {
      int range = right - left + 1;
      int rand_pivot_index = (int) (Math.random() * range) + left;

      // troca o valor aleatório escolhido com a primeira posição
      swap(values, left, rand_pivot_index);

      int pivot = values[left];
      int i = left;

      for (int j = left + 1; j <= right; j++) {
         if (values[j] <= pivot) {
            i += 1;
            swap(values, i, j);
         }
      }

      // troca pivot (values[left]) com i.
      swap(values, left, i);

      return i;
   }

   public int pickPivotIndex(int[] values, int left, int right) {
      int mid = (left + right) / 2;

      int[] sorted = { values[left], values[mid], values[right] };
      Arrays.sort(sorted);

      if (sorted[1] == values[left])
         return left;
      else if (sorted[1] == values[mid])
         return mid;
      else
         return right;
   }

   public static void swap(int vet[], int esq, int dir) {
      int aux;
      aux = vet[esq];
      vet[esq] = vet[dir];
      vet[dir] = aux;
   }

   public static int[] MergeSort(int[] copia, int n) {
      double tempoInicial = System.currentTimeMillis();
      if (n < 2) {
         return copia;
      }
      int mid = n / 2;
      int[] l = new int[mid];
      int[] r = new int[n - mid];

      for (int i = 0; i < mid; i++) {
         l[i] = copia[i];
      }
      for (int i = mid; i < n; i++) {
         r[i - mid] = copia[i];
      }
      MergeSort(l, mid);
      MergeSort(r, n - mid);

      merge(copia, l, r, mid, n - mid);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial) * 1000d;
      System.out.println("Tempo de Processamento de MergeSort:" + tempoTrascorrido + "ms");
      return copia;
   }

   public static void merge(int[] copia, int[] e, int[] d, int esq, int dir) {

      int i = 0, j = 0, k = 0;
      while (i < esq && j < dir) {
         if (e[i] <= d[j]) {
            copia[k++] = e[i++];
         } else {
            copia[k++] = d[j++];
         }
      }
      while (i < esq) {
         copia[k++] = e[i++];
      }
      while (j < dir) {
         copia[k++] = d[j++];
      }
   }

   public static int[] HeapSort(int copia[]) {
      double tempoInicial = System.currentTimeMillis();
      int n = copia.length;

      for (int i = n / 2 - 1; i >= 0; i--) {
         heapify(copia, n, i);
      }

      for (int i = n - 1; i >= 0; i--) {
         int temp = copia[0];
         copia[0] = copia[i];
         copia[i] = temp;

         heapify(copia, i, 0);

      }
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial) * 1000d;
      System.out.println("Tempo de Processamento de HeapSort:" + tempoTrascorrido + "ms");
      return copia;
   }

   public static void heapify(int copia[], int n, int i) {

      int maior = i;
      int esq = 2 * i + 1;
      int dir = 2 * i + 2;

      if (esq < n && copia[esq] > copia[maior])
         maior = esq;

      if (dir < n && copia[dir] > copia[maior])
         maior = dir;

      if (maior != i) {
         int aux = copia[i];
         copia[i] = copia[maior];
         copia[maior] = aux;

         heapify(copia, n, maior);
      }
   }

   public static int[] SelectionSort(int[] vetor) {
      double tempoInicial = System.currentTimeMillis();
      for (int i = 0; i < vetor.length; i++) {
         int i_menor = i;
         for (int j = i + 1; j < vetor.length; j++)
            if (vetor[j] < vetor[i_menor])
               i_menor = j;

         int aux = vetor[i];
         vetor[i] = vetor[i_menor];
         vetor[i_menor] = aux;
      }
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial) * 1000d;
      System.out.println("Tempo de Processamento de SelectionSort:" + tempoTrascorrido + "ms");
      return vetor;
   }

   public static int[] InsertionSort(int[] copia) {
      double tempoInicial = System.currentTimeMillis();
      for (int i = 1; i < copia.length; i++) {
         int j = i;
         while (j > 0 && copia[j] < copia[j - 1]) {
            int aux = copia[j];
            copia[j] = copia[j - 1];
            copia[j - 1] = aux;
            j -= 1;
         }

      }
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial) * 1000d;
      System.out.println("Tempo de Processamento de InsertionSort:" + tempoTrascorrido + "ms");
      return copia;
   }

   public static int[] BubbleSort(int[] copia) {

      double tempoInicial = System.currentTimeMillis();
      for (int i = 0; i < copia.length; i++) {
         for (int j = 0; j < copia.length - 1; j++) {
            if (copia[j] > copia[j + 1]) {
               int aux = copia[j];
               copia[j] = copia[j + 1];
               copia[j + 1] = aux;
            }
         }
      }
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial) * 1000d;
      System.out.println("Tempo de Processamento de BubbleSort:" + tempoTrascorrido + "ms");
      return copia;
   }

   public static void preencheVetorCrescente(int[] vetor) {
      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = i;
      }
   }

   public static void preencheVetorDecrescente(int[] vetor) {
      int j = 0;
      for (int i = vetor.length - 1; i >= 0; i--) {
         vetor[i] = j;
         j++;
      }
   }

   public static void preencheVetorAleatorio(int[] vetor) {
      Random random = new Random();
      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = random.nextInt(100);
      }
   }

   public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
       int vetorCrescente1[] = new int[1000];
       int vetorCrescente2[] = new int[10000];
       int vetorCrescente3[] = new int[100000];
       int vetorCrescente4[] = new int[1000000];

      // Vetores decrescentes

       int vetorDecrescente1[] = new int[1000];
       int vetorDecrescente2[] = new int[10000];
       int vetorDecrescente3[] = new int[100000];
      int vetorDecrescente4[] = new int[1000000];

      // Vetores aleatórios

      int vetorAleatorio1[] = new int[1000];
      int vetorAleatorio2[] = new int[10000];
      int vetorAleatorio3[] = new int[100000];
      int vetorAleatorio4[] = new int[1000000];

      // Preenchimento de vetores crescentes

       preencheVetorCrescente(vetorCrescente1);
       preencheVetorCrescente(vetorCrescente2);
      preencheVetorCrescente(vetorCrescente3);
       preencheVetorCrescente(vetorCrescente4);

      // Preenche de vetores decrescentes

       preencheVetorDecrescente(vetorDecrescente1);
       preencheVetorDecrescente(vetorDecrescente2);
       preencheVetorDecrescente(vetorDecrescente3);
      preencheVetorDecrescente(vetorDecrescente4);

      // Preenchimento de vetores aleatórios

      preencheVetorAleatorio(vetorAleatorio1);
      preencheVetorAleatorio(vetorAleatorio2);
      preencheVetorAleatorio(vetorAleatorio3);
      preencheVetorAleatorio(vetorAleatorio4);

       BubbleSort(vetorCrescente1);

       BubbleSort(vetorCrescente2);

       BubbleSort(vetorCrescente3);

       BubbleSort(vetorCrescente4);

      // Ordenação Bubblesort vetores decrescentes

       BubbleSort(vetorDecrescente1);

      BubbleSort(vetorDecrescente2);

       BubbleSort(vetorDecrescente3);

      BubbleSort(vetorDecrescente4);

      // Ordenação Bubblesort vetores aleatórios

      BubbleSort(vetorAleatorio1);

      BubbleSort(vetorAleatorio2);

      BubbleSort(vetorAleatorio3);

      BubbleSort(vetorAleatorio4);

      // Ordenacao SelectionSort vetores crescentes

       SelectionSort(vetorCrescente1);

       SelectionSort(vetorCrescente2);

      SelectionSort(vetorCrescente3);

      SelectionSort(vetorCrescente4);

      // Ordenação SelectionSort vetores decrescentes

      SelectionSort(vetorDecrescente1);

      SelectionSort(vetorDecrescente2);

      SelectionSort(vetorDecrescente3);

      SelectionSort(vetorDecrescente4);

      // Ordenação SelectionSort vetores aleatórios

      SelectionSort(vetorAleatorio1);

      SelectionSort(vetorAleatorio2);

      SelectionSort(vetorAleatorio3);

      SelectionSort(vetorAleatorio4);

      // Ordenação InsertionSort vetores crescentes

       InsertionSort(vetorCrescente1);

      InsertionSort(vetorCrescente2);

       InsertionSort(vetorCrescente3);

      InsertionSort(vetorCrescente4);

      // Ordenação InsertionSort vetores decrescentes

      InsertionSort(vetorDecrescente1);

      InsertionSort(vetorDecrescente2);

      InsertionSort(vetorDecrescente3);

      InsertionSort(vetorDecrescente4);

      // Ordenação InsertionSort vetores aleatórios

      InsertionSort(vetorAleatorio1);

      InsertionSort(vetorAleatorio2);

      InsertionSort(vetorAleatorio3);

      InsertionSort(vetorAleatorio4);

      // Ordenação HeapSort vetores crescentes

      HeapSort(vetorCrescente1);

       HeapSort(vetorCrescente2);

       HeapSort(vetorCrescente3);

      HeapSort(vetorCrescente4);

      // Ordenação HeapSort vetores decrescentes

      HeapSort(vetorDecrescente1);

      HeapSort(vetorDecrescente2);

      HeapSort(vetorDecrescente3);

      HeapSort(vetorDecrescente4);

      // Ordenação HeapSort vetores aleatórios

      HeapSort(vetorAleatorio1);

      HeapSort(vetorAleatorio2);

      HeapSort(vetorAleatorio3);

      HeapSort(vetorAleatorio4);

      // Ordenação MergeSort vetores crescentes

       MergeSort(vetorCrescente1, vetorCrescente1.length);

       MergeSort(vetorCrescente2, vetorCrescente2.length);

       MergeSort(vetorCrescente3, vetorCrescente3.length);

      MergeSort(vetorCrescente4, vetorCrescente4.length);

      // Ordenação MergeSort vetores decrescentes

      MergeSort(vetorDecrescente1, vetorDecrescente1.length);
   
       MergeSort(vetorDecrescente2, vetorDecrescente2.length);
      
       MergeSort(vetorDecrescente3, vetorDecrescente3.length);

      MergeSort(vetorDecrescente4, vetorDecrescente4.length);

      // Ordenação MergeSort vetores aleatórios

      MergeSort(vetorAleatorio1, vetorAleatorio1.length);

      MergeSort(vetorAleatorio2, vetorAleatorio2.length);

      MergeSort(vetorAleatorio3, vetorAleatorio3.length);

      MergeSort(vetorAleatorio4, vetorAleatorio4.length);

      // Ordenação QuickSort vetores crescentes

       double tempoInicial = System.currentTimeMillis();
       QuickSort(vetorCrescente1, 0, vetorCrescente1.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorCrescente2, 0, vetorCrescente2.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorCrescente3, 0, vetorCrescente3.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorCrescente4, 0, vetorCrescente4.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      // Ordenação QuickSort vetores decrescentes

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorDecrescente1, 0, vetorDecrescente1.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorDecrescente2, 0, vetorDecrescente2.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorDecrescente3, 0, vetorDecrescente3.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorDecrescente4, 0, vetorDecrescente4.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      // Ordenação QuickSort vetores aleatórios

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorAleatorio1, 0, vetorAleatorio1.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorAleatorio2, 0, vetorAleatorio2.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorAleatorio3, 0, vetorAleatorio3.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      double tempoInicial = System.currentTimeMillis();
      QuickSort(vetorAleatorio4, 0, vetorAleatorio4.length - 1);
      double tempoTrascorrido = (System.currentTimeMillis() - tempoInicial)*1000d;
      System.out.println("Tempo de Processamento de QuickSort:" + tempoTrascorrido
      +"ms");

      ent.close();
   }
}
