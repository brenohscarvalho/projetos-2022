package questão2;

public class Lista {
	public Celula prim;
	public Celula ult;

	Lista() {
		prim = new Celula();
		ult = prim;
	}

	int tam = 0;

	void queue(int num) {
		ult.prox = new Celula(num);
		ult = ult.prox;
		tam++;
	}	
	int soma() {
		int retorno=0;
		Celula aux = prim.prox;
		while(aux != null) {
			retorno += aux.num;
			aux = aux.prox;
		}
		return retorno;
	}
}
