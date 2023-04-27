import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Pilha pilha = new Pilha();
		for(int i = 0; i<4;i++) {
			System.out.println("Digite um valor: ");
			CelulaP x = new CelulaP(ent.nextInt());
			pilha.Empilha(x);
		}
		
		pilha.Imprime();
        System.out.println();
		// System.out.println("Desempilha");
		// pilha.Desempilha();
		pilha.Imprime();
		System.out.println("Tamanho: "+pilha.getTamanho());
        System.out.println("Soma"+pilha.SomaDesempilha());
        System.out.println("Tamanho: "+pilha.getTamanho());

    }

}