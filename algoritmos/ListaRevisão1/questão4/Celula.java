package questão4;

public class Celula {
	public int num;
	public Celula prox;
	Celula(){
		this(0);
	}
	public Celula(int num){
		this.num = num;
		this.prox = null;
	}
}
