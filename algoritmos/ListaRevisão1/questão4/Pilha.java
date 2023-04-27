package questão4;

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
	
	public int remover()throws Exception{
		if(topo == null) {
			throw new Exception("Erro!");
		}
		int elemento = topo.num;
		Celula aux = topo;
		topo = topo.prox;
		aux.prox = null;
		aux = null;
		return elemento;
	}
	
	void mostrar() {
		for(Celula i = topo; i!= null; i=i.prox) {
			System.out.println(i.num);
		}
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
