package questão6;
public class Celula {
	public char letra;
	public Celula prox;
	Celula(){
		this('s');
	}
	Celula(char letra){
		this.letra = letra;
		this.prox = null;
	}
}
