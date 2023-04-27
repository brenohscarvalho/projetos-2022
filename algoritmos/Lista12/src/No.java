public class No {
    public String _nome;
    public String _telefone;
    public No _noEsq;
    public No _noDir;

    public No(String nome, String telefone){
        _nome = nome;
        _telefone = telefone;
        _noEsq = null;
        _noDir = null;
    }
}
