package questão9;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random i = new Random();
		ListaD x = new ListaD();
		
		for(int j=0;j<10;j++) {
			x.inseririnicio(i.nextInt(100));
		}
		x.mostrarprim();
		System.out.println();
		x.mostrarult();
		System.out.println();
		for(int j=0;j<9;j++) {
			x.RemoverInicio();
		}
		x.mostrarprim();
	}

}
