package questão1;

class Celula {
	public char letra;
	public Celula prox;
	public Celula ant;
	Celula(){
		this('s');
	}
	Celula(char letra){
		this.letra = letra;
		this.prox = null;
		this.ant = null;
	}
}
