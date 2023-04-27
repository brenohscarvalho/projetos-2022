package questão6;

public class Pilha {
public Celula topo;
	
	Pilha(){
		topo = null;
	}
	public void inserir(char x){
		Celula aux = new Celula(x);
		aux.prox = topo;
		topo = aux;
		aux = null;
	}
}
