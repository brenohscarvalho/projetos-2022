public class No {
    public String telefone;
    public String nome;
    public No esquerda;
    public No direita;

    No(String telefone,String nome, No esquerda, No direita){
        this.esquerda = esquerda;
        this.direita = direita;
        this.telefone = telefone;
        this.nome = nome;
    }
}
