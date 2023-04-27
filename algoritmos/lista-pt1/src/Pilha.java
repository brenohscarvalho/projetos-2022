public class Pilha {
	public CelulaP topo; 
	public int tamanho;
	
	public Pilha() {
		topo = null;
		tamanho = 0;
	}
	public void Empilha(CelulaP aux) {
		aux.prox = topo;
		topo = aux;
		aux = null;
		tamanho++;
	}
	public int Desempilha() {
		int elemento = topo.elemento;
		CelulaP aux = topo;
		topo = topo.prox;
		aux = aux.prox = null;
		tamanho--;
		return elemento;
	}
	public void Imprime() {
		CelulaP aux = topo;
		while(aux != null) {
			System.out.println(aux.elemento);
			aux = aux.prox;
		}
	}
	public int getTamanho() {
		return tamanho;
	}
	public boolean Vazio() {
		if(tamanho<=0)
			return true;
		else
			return false;
	}
    public int SomaDesempilha(){
        int soma = 0;
        while(!Vazio())
        soma+=Desempilha();
        return soma;
    }
}