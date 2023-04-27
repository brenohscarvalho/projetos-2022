public class CelulaD {
	public int elemento;
	public CelulaD prox;
    public CelulaD ant;
	
	public CelulaD(){
		this(0);
	}
	public CelulaD(int elemento) {
		this.elemento = elemento;
		prox = null;
        ant = null;
	}
	
}