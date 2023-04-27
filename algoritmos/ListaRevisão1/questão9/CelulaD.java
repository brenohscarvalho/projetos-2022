package questão9;

public class CelulaD {
	CelulaD ant,prox;
	int elemento;
	
	CelulaD(){
		this(-1);
	}
	CelulaD(int elemento){
		this.elemento = elemento;
		ant = prox = null;
	}
}
