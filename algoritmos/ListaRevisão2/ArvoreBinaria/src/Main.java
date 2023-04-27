import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var arvore = new ArvoreBinaria();

        Scanner ent = new Scanner(System.in);
        try {
            // Preenchimento
            for (int i = 0; i < 1; i++) {
                System.out.print("Digite o nome que deseja inserir: ");
                var nome = ent.nextLine();
                System.out.println();

                System.out.print("Digite o endereço que deseja inserir: ");
                var endereco = ent.nextLine();
                System.out.println();

                System.out.print("Digite a idade que deseja inserir: ");
                var idade = ent.nextInt();
                ent.nextLine();
                System.out.println();

                System.out.print("Digite a renda que deseja inserir: ");
                var renda = ent.nextDouble();
                ent.nextLine();

                arvore.Inserir(nome, endereco, idade, renda);
            }

            System.out.print("Digite o nome que deseja buscar: ");
            var nome_pesquisa = ent.nextLine();
            arvore.PesquisarNome(nome_pesquisa);
            System.out.println();

            System.out.print("Digite o valor minimo da renda: ");
            var valor_minimo = ent.nextDouble();
            System.out.print("Digite o valor maximo da renda: ");
            var valor_maximo = ent.nextDouble();
            var quantidade = arvore.PesquisarRenda(valor_minimo, valor_maximo);
            System.out.println("Quantidade de pessoas com a renda entre " + valor_minimo + " " + valor_maximo + " é de "+ quantidade);
            
        int i=0;
        var idade = new int[10];
        var teste = arvore.vetoridade(idade);
        while(i <2) {
            System.out.println(teste[i ]);
            i ++;
        }

        // int [] rendas = new int[10];
        // i=0;
        // arvore.vetrenda(rendas);
        // while(i<2) {
        //     System.out.println(rendas[i]);
        //     i++;
        // }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        ent.close();
    }
}