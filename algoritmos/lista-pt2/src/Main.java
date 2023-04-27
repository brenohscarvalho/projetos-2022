

public class Main{
   public static void main(String[] args){
    ListaD lista = new ListaD();

    for (int i = 1; i <= 5; i++) {
        CelulaD x;
        if (i == 1 || i == 2) {
            x = new CelulaD(i);
            lista.InserirInicio(x);
        }
        else {
            x = new CelulaD(i);
            lista.InserirFinal(x);
        }

    }
    System.out.println("Tamanho da lista: " + lista.getTamanho());

    System.out.print("Print lista inicio ao fim: ");
    lista.ImprimeInicioFim();

    System.out.println();
    System.out.print("Print lista fim ao início: ");
    lista.ImprimeFimInicio();
    System.out.println();

    System.out.println("Elemento 1 removido do início: " + lista.removerInicio().elemento);
    System.out.println("Elemento 2 removido do início: " + lista.removerInicio().elemento);

    System.out.println("Elemento 1 removido do final: " + lista.RetirarFim().elemento);
    System.out.println("Elemento 2 removido do final: " + lista.RetirarFim().elemento);

    if (!lista.Vazio())
        System.out.println("Lista não está vazia");
    else
        System.out.println("Lista vazia");
    // System.out.println();

}
}
