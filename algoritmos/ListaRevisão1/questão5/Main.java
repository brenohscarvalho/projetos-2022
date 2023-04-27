package questão5;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Lista x = new Lista();
		Random j = new Random();
		
		for(int i=0; i<30; i++) {
			x.queue(j.nextInt(10));
		}
		
		System.out.println("Digite um número de 0 a 10:");
		int num = ent.nextInt();
		
		System.out.println("A quantidade de vezes que o número repetiu é: " + x.checar(num));
		ent.close();
	}

}
