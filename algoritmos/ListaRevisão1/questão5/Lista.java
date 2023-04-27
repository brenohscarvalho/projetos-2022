package questão5;

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
	
	int checar(int x) {
		Celula aux = prim.prox;
		int i=0;
		while (aux != null) {
			if(aux.num == x) {
				i++;
			}
			aux = aux.prox;
		}
		return i;
	}
	
}
