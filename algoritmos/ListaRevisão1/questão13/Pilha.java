package questão13;

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
	
	int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	void fibo() {
		Celula aux = topo;
		while(aux != null) {
			System.out.println(fibonacci(aux.num));
			aux = aux.prox;
		}
	}
}
