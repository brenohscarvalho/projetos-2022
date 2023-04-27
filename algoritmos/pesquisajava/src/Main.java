import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Adicionar(lista);
        Imprimir(lista);
        System.out.println(PesquisaSequencial(lista,"bruno"));
        System.out.println(PesquisaBinaria(lista,"roberto"));
        RemocaoPesquisaBinaria(lista, "carlos");
        Imprimir(lista);
    }

    public static void Adicionar(List<String> lista) {
        String nome = "k";
        Scanner ent = new Scanner(System.in);
        System.out.println("Insira o nome e utilize FLAG stop para parar: ");
        nome = ent.nextLine();
        while (nome.compareTo("stop") != 0) {
            lista.add(nome);
            System.out.println("Insira o nome e utilize FLAG stop para parar: ");
            nome = ent.nextLine();
        }
    }

    public static void Imprimir(List<String> lista) {
        for (String string : lista) {
            System.out.println(string);
        }
    }

    public static boolean PesquisaSequencial(List<String> lista, String nome) {
        for (String string : lista) {
            if (string.compareTo(nome) == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean PesquisaBinaria(List<String> lista, String nome){
        Collections.sort(lista);
        int meio;
        int fim = lista.size()-1;
        int inicio = 0;
        while(inicio<= fim){
            meio = (fim+inicio)/2;
            if(lista.get(meio).equals(nome)){
                return true;
            }
            else if(lista.get(meio).compareTo(nome)<0){
                inicio = meio+1;
            }
            else if(lista.get(meio).compareTo(nome)>0){
                fim = meio-1;
            }
        }
        return false;
    }
    public static void RemocaoPesquisaBinaria(List<String> lista, String nome){
        Collections.sort(lista);
        int meio;
        int fim = lista.size()-1;
        int inicio = 0;
        while(inicio<= fim){
            meio = (fim+inicio)/2;
            if(lista.get(meio).equals(nome)){
                lista.remove(meio);
                break;
            }
            else if(lista.get(meio).compareTo(nome)<0){
                inicio = meio+1;
            }
            else if(lista.get(meio).compareTo(nome)>0){
                fim = meio-1;
            }
        }
    }
    public static void InserePos(List<String> lString, int pos, String nome) {
        lString.add(pos, nome);
    }
}
