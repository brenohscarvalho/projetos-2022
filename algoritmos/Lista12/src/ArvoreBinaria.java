import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArvoreBinaria {
    No _raiz;

    public ArvoreBinaria() {
       _raiz = null;
    }

    public ArrayList<String> ArrayOrdenado(File txt) throws FileNotFoundException {
        try {
            Scanner ler = new Scanner(txt);

            ArrayList<String> arrayList = new ArrayList<String>();

            while (ler.hasNext()) {
                arrayList.add(ler.nextLine());
            }

            ler.close();
            return arrayList;
        } catch (Exception e) {
            throw new FileNotFoundException("Arquivo não encontrado");

        }
    }

    public void Inserir(String nome, String telefone) throws Exception {
        _raiz = Inserir(nome, telefone, _raiz);
    }

    private No Inserir(String nome, String telefone, No i) throws Exception {
        if (i == null) {
            i = new No(nome, telefone);
        } else if (nome.compareTo(i._nome) < 0) {
            i._noEsq = Inserir(nome, telefone, i._noEsq);
        } else if (nome.compareTo(i._nome) > 0) {
            i._noDir = Inserir(nome, telefone, i._noDir);
        } else {
            throw new Exception("Erro ao inserir Nó");
        }

        return i;
    }

    public String Pesquisar(String nome, No i) throws Exception {
        String resp = null;

        if (i == null) {
            throw new Exception("Nome não se encontra na lista");
        } else if (i._nome.toUpperCase().contains(nome.toUpperCase())) {
            resp = i._telefone;
        } else if (nome.compareTo(i._nome) < 0) {
            resp = Pesquisar(nome, i._noEsq);
        } else if (nome.compareTo(i._nome) > 0) {
            resp = Pesquisar(nome, i._noDir);
        }
        return resp;
    }

    public void Listagem(No i) {
        if (i != null) {
            Listagem(i._noEsq);
            System.out.print("Nome: " + i._nome + "|");
            System.out.println("Telefone:" + i._telefone);
            Listagem(i._noDir);
        }
    }
    public No Raiz(){
        return _raiz;
    }

}
