public class No {
    public String _nome;
    public String _endereco;
    public int _idade;
    public double _renda;
    public No _noEsq;
    public No _noDir;

    public No(String nome, String endereco, int idade, double renda){
        _nome = nome;
        _endereco = endereco;
        _idade = idade;
        _renda = renda;
        _noEsq = null;
        _noDir = null;
    }
    public String getNome() {
		return _nome;
	}
	
	public String getEndereço() {
		return _endereco;
	}
	
	public int getIdade() {
		return _idade;
	}
	
	public double getRenda() {
		return _renda;
	}
	
	public void setEsq(No esq) {
		this._noEsq = esq;
	}
	
	public void setDir(No dir) {
		this._noDir = dir;
	}
}