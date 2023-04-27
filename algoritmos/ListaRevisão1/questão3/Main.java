package questão3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Lista y = new Lista();
		Celula aux = y.prim;
		System.out.println("Digite a quantidade de números:");
		int X = ent.nextInt();
		
		for(int n = 1 ; n <= X; n++) {
			y.queue(n);
		}
		System.out.println("A soma iterativa é:" + y.soma(aux));
		ent.close();
	}

}