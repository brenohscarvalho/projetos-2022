package questão10;

public class Filapar {
	private int vetor[];
	private int tamanho;
	
	Filapar(){
		this(10);
	}
	Filapar(int x){
		vetor = new int [x];
		tamanho = 0;
	}
	
	void inserirInicio(int x) {
		if(tamanho == vetor.length) {
			System.out.println("Vetor cheio");
		}else {
			for(int i = tamanho; i>0;i--) {
				vetor[i] = vetor[i-1];
			}
			vetor[0] = x;
			tamanho++;
		}
	}
	
	void mostrar() {
		if(vetor.length == tamanho) {
			System.out.println("Lista vazio");
		}else {
			for(int i=0;i<tamanho;i++) {
				System.out.print("["+vetor[i]+"] ");
			}
			System.out.println();
		}
	}
	void getam() {
		System.out.println(tamanho);
	}
}
