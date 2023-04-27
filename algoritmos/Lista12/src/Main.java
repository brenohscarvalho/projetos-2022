import java.io.File;
import java.util.Scanner;

public class Main {

    public static void Menu(ArvoreBinaria arvoreBinaria) throws Exception{
        int opc;
        Scanner ent = new Scanner(System.in);

        System.out.println("1 - Listar Contatos em ordem alfabética");
        System.out.println("2 - Pesquisar Contato");
        System.out.println("3 - Fechar programa");
        opc = ent.nextInt();
        ent.nextLine();
        System.out.println();

        if(opc == 1)
        {
            arvoreBinaria.Listagem(arvoreBinaria.Raiz());
            System.out.println();
            Menu(arvoreBinaria);
        }
        else if(opc == 2)
        {
            System.out.print("Digite o nome do contato que deseja buscar: ");
            System.out.println("Número: " + arvoreBinaria.Pesquisar(ent.nextLine(), arvoreBinaria.Raiz()));    
            System.out.println();
            Menu(arvoreBinaria);
        }
        else if(opc == 3)
        { 
            System.out.println("Fim do programa");
            
            ent.close();
        }
        else
        {
            ent.close();
            throw new Exception("Opção inválida");
        }
        
    }
    public static void main(String[] args) {
        var arvore = new ArvoreBinaria();   
       

        try {
            File txt = new File("src/agenda.txt");
            var arrayList = arvore.ArrayOrdenado(txt);

            for (int i = 0; i < arrayList.size(); i++) {
                arvore.Inserir(arrayList.get(i).split("#")[0], arrayList.get(i).split("#")[1]);
            }
            Menu(arvore);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}