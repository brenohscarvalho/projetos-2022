package questão3;

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
	int retorno = 0;
	
	int soma(Celula aux) {
		if(aux == null) {
			return 0;
		}
		else{
			retorno = aux.num + soma(aux.prox);
			return retorno;
		}
	}
}
