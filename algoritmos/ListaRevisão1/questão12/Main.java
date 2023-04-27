package questão12;

import java.util.Scanner;

import questão4.Celula;

public class Main {

	public static void main(String[] args) {
		Pilha x = new Pilha();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a quantidade de números:");
		int N = ent.nextInt();
		for(int i=1;i<=N;i++) {
			x.inserir(i);
		}
		Celula i = x.topo;
		System.out.println(x.fatorial(i));
		
		ent.close();
	}

}
