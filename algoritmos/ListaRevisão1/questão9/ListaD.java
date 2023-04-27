package questão9;

public class ListaD {
	CelulaD prim, ult;
	int tamanho;

	ListaD() {
		prim = new CelulaD();
		ult = prim;
		tamanho = 0;
	}

	void inseririnicio(int elemento) {
		CelulaD aux = new CelulaD(elemento);
		aux.prox = prim.prox;
		aux.ant = prim;
		prim.prox = aux;
		if (prim == ult) {
			ult = ult.prox;
		} else {
			aux.prox.ant = aux;
		}
		tamanho++;
	}

	int RemoverInicio() {
		CelulaD aux = prim.prox;
		int retorno = prim.prox.elemento;
		prim.prox = prim.prox.prox;
		aux.prox = null;
		if (aux != ult) {
			prim.prox.ant = prim;
		} else {
			prim = ult;
		}
		aux.ant = null;
		aux = null;
		tamanho--;
		return retorno;
	}
	
	void mostrarprim() {
		CelulaD aux = prim.prox;
		while (aux != null) {
			System.out.print(aux.elemento + " ");
			aux = aux.prox;
		}
	}

	void mostrarult() {
		CelulaD aux = ult;
		while(aux != prim) {
			System.out.print(aux.elemento + " ");
			aux = aux.ant;
		}
	}
}
