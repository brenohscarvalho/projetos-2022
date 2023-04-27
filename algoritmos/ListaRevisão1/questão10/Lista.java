package questão10;

public class Lista {
	private int vetor[];
	private int tamanho;

	Lista() {
		this(10);
	}

	Lista(int x) {
		vetor = new int[x];
		tamanho = 0;
	}

	void mostrar() {
		if (vetor.length == tamanho) {
			System.out.println("Lista vazio");
		} else {
			for (int i = 0; i < tamanho; i++) {
				System.out.print("[" + vetor[i] + "] ");
			}
		}
	}

	void inserirInicio(int x) {
		if (tamanho == vetor.length) {
			System.out.println("Vetor cheio");
		} else {
			vetor[tamanho] = x;
			tamanho++;
		}
	}

	Filapar x = new Filapar();
	Filaimpar y = new Filaimpar();

	int removerInicio() {
		int retorno = vetor[0];
		if (retorno%2 != 0) {
			y.inserirInicio(retorno);
		} else {
			x.inserirInicio(retorno);
		}
		for (int i = 0; i < tamanho - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		tamanho--;
		return retorno;
	}

	void mostrarpar() {
		System.out.println("Mostar par");
		x.mostrar();
	}

	void mostrarimpar() {
		System.out.println("Mostar impar");
		y.mostrar();
	}
}
