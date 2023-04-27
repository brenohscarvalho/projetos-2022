public class ArvoreBinaria {
    private int tamanho;
    No _raiz;
    public int quantidade_pessoas;
    public ArvoreBinaria() {
        try {
            tamanho = 0;
            _raiz = null;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void Inserir(String nome, String endereco, int idade, double renda) throws Exception {
        _raiz = Inserir(nome, endereco, idade, renda, _raiz);
        tamanho++;
    }

    public No Inserir(String nome, String endereco, int idade, double renda, No i) throws Exception {
        if (i == null) {
            i = new No(nome, endereco, idade, renda);
        } else if (nome.compareTo(i._nome) < 0) {
            i._noEsq = Inserir(nome, endereco, idade, renda, i._noEsq);
        } else if (nome.compareTo(i._nome) > 0) {
            i._noDir = Inserir(nome, endereco, idade, renda, i._noDir);
        } else {
            throw new Exception("Erro ao inserir Nó");
        }

        return i;
    }

    public void PesquisarIdade(int idade) {
        PesquisarIdade(idade, _raiz);
    }

    private void PesquisarIdade(int idade, No i) {

        if (i != null) {

            if (i._idade == idade) {

                System.out.println(i._nome);
                PesquisarIdade(idade, i._noDir);
                PesquisarIdade(idade, i._noEsq);
            } else if (i._idade > idade) {
                PesquisarIdade(idade, i._noEsq);
            } else if (i._idade < idade) {
                PesquisarIdade(idade, i._noDir);
            }
        }
    }

    public int PesquisarRenda(double renda_min, double renda_maxima) {
        quantidade_pessoas = 0;
        PesquisarRenda(renda_min, renda_maxima, _raiz);
        return quantidade_pessoas; 
    }

    private void PesquisarRenda(double renda_min, double renda_maxima, No i) {

        if (i != null) {

            if (i._renda > renda_min && i._renda < renda_maxima) {
                quantidade_pessoas++;
                PesquisarRenda(renda_min, renda_maxima, i._noEsq);
                PesquisarRenda(renda_min, renda_maxima, i._noDir);
            } else if (i._renda < renda_min && i._renda < renda_maxima) {
                
                PesquisarRenda(renda_min, renda_maxima, i._noEsq);
            } else if (i._renda > renda_min && i._renda > renda_maxima) {
                
                PesquisarRenda(renda_min, renda_maxima, i._noDir);
            }
        }
    }

    public void PesquisarNome(String nome){
        PesquisarNome(nome,_raiz);
    }
    private void PesquisarNome(String nome, No i){
        if (i != null) {
            if (i._nome.equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + i._nome);
                System.out.println("Endereço: " + i._endereco);
                System.out.println("Idade: " + i._idade);
            } else if (nome.compareTo(i._nome) < 0) {
                PesquisarNome(nome, i._noDir);
            } else if (nome.compareTo(i._nome) > 0){
                PesquisarNome(nome, i._noEsq);
            }
        }
    }

    public int[] PreencherVetor(ArvoreBinaria arvore){
        var vetor = new int[arvore.getTamanho()];
        var raiz = arvore.getRaiz();
        percorrerArvore(raiz, vetor, 0);

        return vetor;

    }
    void percorrerArvore(No raiz, int[] vetor, int indice) {
        // Verifique se o no atual e valido
        if (raiz == null) {
          return;
        }
      
        // Adicione a idade da pessoa no no atual no vetor
        vetor[indice++] = raiz._idade;
        
      
        // Percorra a sub-arvore esquerda
        percorrerArvore(raiz._noEsq, vetor, indice);
      
        // Percorra a sub-arvore direita
        percorrerArvore(raiz._noDir, vetor, indice);
      }
      public int [] vetoridade(int [] idade) {
        int i= 0;
        vetoridade(idade, _raiz, i);
        return idade;
    }

    public int vetoridade(int [] vet, No x, int i) {
        if(x != null) {
            i += vetoridade(vet, x._noEsq, i);
            vet[i] = x.getIdade();
            i++;
            i += vetoridade(vet, x._noDir, i);
            i--;
        }
        for(i=vet.length-1;i>= 1; i--) {
            for(int j=0;j<i;j++) {
                if(vet[i]<vet[j]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        return i;
    }

    // public double [] vetrenda(double [] vet) {
    //     int i= 0;
    //     vetrenda(vet, _raiz, i);
    //     return vet;
    // }

    // public int vetrenda(int [] vet, No x, int i) {
    //     if(x != null) {
    //         i += vetrenda(vet, x._noEsq, i);
    //         vet[i] = x._renda;
    //         i++;
    //         i += vetrenda(vet, x._noDir, i);
    //         i--;
    //     }
    //     for(i=vet.length-1;i>= 1; i--) {
    //         for(int j=0;j<i;j++) {
    //             if(vet[i]>vet[j]) {
    //                 int aux = vet[i];
    //                 vet[i] = vet[j];
    //                 vet[j] = aux;
    //             }
    //         }
    //     }
    //     return i;
    // }

    public void Imprimir(No i) {
        System.out.println("chegou");
        if (i != null) {
            Imprimir(i._noEsq);
            System.out.print("Nome: " + i._nome);
            System.out.println("idade:" + i._idade);
            Imprimir(i._noDir);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public No getRaiz() {
        return _raiz;
    }
}