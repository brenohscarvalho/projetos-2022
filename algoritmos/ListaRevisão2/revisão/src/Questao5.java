import java.util.Random;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ent = new Scanner(System.in);
        int pesquisa = 0;
        int vetor[] = new int[120];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);
        }

        BubbleSort(vetor);

        System.out.println("Vetor random (até 50) ordenado: ");
        for (int i : vetor) {
            System.out.print(i + "  ");
        }
        System.out.println();

        System.out.println("Digite a nota a ser presquisada: ");
        pesquisa = ent.nextInt();

        System.out
                .println(pesquisarSequencial(pesquisa, vetor) + "comparações foram realizadas na Pesquisa Sequencial");
        System.out.println();
        System.out.println(buscaBinaria(pesquisa, vetor) + "comparações foram realizadas na Pesquisa Binaria");
        ent.close();
    }

    public static void BubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static int pesquisarSequencial(int x, int[] notas) {
        int contagem = 0;
        for (int i = 0; i < notas.length; i++) {
            contagem++;
            if (notas[i] == x) {
                System.out.println("Nota: " + x + " Encontrada");
                return contagem;
            }
        }
        return contagem;
    }

    public static int buscaBinaria(int p, int[] notas) {
        int inicio = 0;
        int fim = notas.length - 1;
        int meio;
        var contagem = 0;

        while (inicio <= fim) {
            contagem++;
            meio = (inicio + fim) / 2;
            if (notas[meio] == p) {
                System.out.println("Nota: " + p + " Encontrada");
                return contagem;
            } else if (notas[meio] < p) {
                contagem++;
                inicio = meio + 1;
            } else if (notas[meio] > p) {
                contagem++;
                fim = meio - 1;
            }
        }
        return contagem;

    }

}
