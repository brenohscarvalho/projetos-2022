public class ListaD {
    public CelulaD prim;
    public CelulaD ult;
    public int tamanho;

    public ListaD(){
        tamanho =0;
        prim = new CelulaD();
        ult=prim;
    }
    public void InserirInicio(CelulaD aux){
        aux.prox = prim.prox;
        aux.ant = prim;
        prim.prox =aux;

        if(prim == ult)
        ult = ult.prox;
        else
        aux.prox.ant = aux;
        
        tamanho++;
    }
    public void InserirFinal(CelulaD aux){
        ult.prox = aux;
        ult.prox.ant = ult;
        ult = aux;

        tamanho++;
    }
   public CelulaD removerInicio(){
    CelulaD aux = prim.prox;
    prim.prox=prim.prox.prox;
    prim.prox.ant = prim.prox;

    return aux;
   }
   public CelulaD RetirarFim() {
    CelulaD aux = ult;
    ult = ult.ant;
    ult.prox.ant = null;
    ult.prox = null;
    
    tamanho--;
    return aux;
}
public boolean Vazio(){
    if(tamanho<=0)
        return true;
    else
        return false;

}
public int getTamanho() {
    return tamanho;
}
public void ImprimeInicioFim() {
    if(!Vazio()){
        CelulaD auxP = prim.prox;

    while (auxP != null) {
        System.out.print(auxP.elemento + " ");
        auxP = auxP.prox;

    }
    }else
        System.out.println("Lista está vazia");

}
public void ImprimeFimInicio() {
    CelulaD auxP = ult;

    while (auxP != null) {
        System.out.print(auxP.elemento + " ");
        auxP = auxP.ant;

    }
}

}
