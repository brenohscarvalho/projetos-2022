package questão12;

import questão4.Celula;

public class Pilha {
	public Celula topo;
	Pilha(){
		topo = null;
	}
	public void inserir(int x){
		Celula aux = new Celula(x);
		aux.prox = topo;
		topo = aux;
		aux = null;
	}
	int fatorial(Celula i) {
		if(i.num > 1) {
			return i.num*fatorial(i.prox);
		}
		else {
			return 1;
		}
	}
}
