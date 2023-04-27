import java.util.Arrays;
import java.util.Scanner;

public class pesquisaSequencialBinaria {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] notas = { 10, 7, 3, 8, 9, 2 };
        int pesquisa = 0;

        System.out.println("Digite a nota a ser presquisada: ");
        pesquisa = ent.nextInt();

        System.out.println(pesquisarNumero(pesquisa, notas));
        System.out.println();
        System.out.println(buscaBinaria(pesquisa, notas));
        ent.close();
    }

    public static boolean pesquisarNumero(int x, int[] notas) {

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == x) {
                System.out.println("Nota: " + x + " Encontrada");
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinaria(int p, int[] notas) {
        int inicio = 0;
        int fim = notas.length - 1;
        int meio;

        Arrays.sort(notas);

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (notas[meio] == p) {
                System.out.println("Nota: " + p + " Encontrada");
                return true;
            } else if (notas[meio] < p)
                inicio = meio + 1;
            else if (notas[meio] > p)
                fim = meio - 1;
        }
        return false;

    }
}
