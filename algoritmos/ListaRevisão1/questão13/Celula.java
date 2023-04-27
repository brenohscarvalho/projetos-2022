package questão13;

public class Celula {
	public int num;
	public Celula prox;
	Celula(){
		this(0);
	}
	Celula(int i){
		this.num = i;
		this.prox = null;
	}
}
