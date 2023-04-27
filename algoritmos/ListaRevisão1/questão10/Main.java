package questão10;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random ent = new Random();
		Lista x = new Lista();
		
		for(int i=0;i<10;i++) {
			x.inserirInicio(ent.nextInt(10));
		}
		x.mostrar();
		
		for(int i=0;i<10;i++) {
			x.removerInicio();
		}
		x.mostrar();
		x.mostrarpar();
		x.mostrarimpar();
	}

}
