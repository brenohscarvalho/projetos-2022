package questão6;
public class Lista {
	public Celula prim;
	public Celula ult;

	Lista() {
		prim = new Celula();
		ult = prim;
	}

	int tam = 0;

	void queue(char letra) {
		Celula aux = new Celula(letra);
		ult.prox = aux;
		ult = ult.prox;
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
		int ver=0;
		Celula auxpilha = prim.prox;
		Pilha x  = new Pilha();
		while(auxpilha != null) {
			x.inserir(auxpilha.letra);
			auxpilha = auxpilha.prox;
		}
		
		Celula aux = prim.prox;
		Celula auxp = x.topo;
		while(aux != null || auxp != null) {
			if(aux.letra == auxp.letra) {
				ver++;
			}
			aux =aux.prox;
			auxp = auxp.prox;
		}
		if(tam == ver) {
			return true;
		}
		else {
			return false;
		}
	}

}
