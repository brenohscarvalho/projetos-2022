package questão2;


public class Celula {
	public int num;
	public Celula prox;
	Celula(){
		this(0);
	}
	Celula(int num){
		this.num = num;
		this.prox = null;
	}
}
