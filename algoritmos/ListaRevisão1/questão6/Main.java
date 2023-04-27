package questão6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Lista x = new Lista();
		System.out.println("Digite uma palavra ou frase:");
		String a = ent.nextLine();
		char[] b = a.toCharArray();
		
		for(int i = 0; i< b.length;i++) {
			x.queue(b[i]);
		}
		x.mostrar();
		System.out.println();
		if(x.palindromo()) {
			System.out.println("É palindromo");
		}
		else {
			System.out.println("Não é palindromo");
		}
		ent.close();
		
	}
}
