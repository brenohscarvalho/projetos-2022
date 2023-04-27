package questão1;

class Lista {
	public Celula prim;
	public Celula ult;
	
	public Celula pp;
	public Celula pa;

	Lista() {
		prim = new Celula();
		ult = prim;
	}

	int tam = 0;

	void queue(char letra) {
		Celula aux = new Celula(letra);
		ult.prox = aux;
		aux.ant = ult;	
		ult = ult.prox;
		pa = ult;
		tam++;
	}	

	void mostrar() {
		Celula aux = prim.prox;
		while (aux != null) {
			System.out.print(aux.letra + " ");
			aux = aux.prox;
		}
	}
	boolean palindromo() {
		pp = prim.prox;
		Celula aux = prim.prox;
		int verdadeiro=0;
		while(aux != null) {
			if(pp.letra == pa.letra) {
				verdadeiro++;
			}
			pa = pa.ant;
			pp = pp.prox;
			aux = aux.prox;
		}
		if(verdadeiro == tam) {
			return true;
		}
		else{
			return false;
		}
	}
	
}
