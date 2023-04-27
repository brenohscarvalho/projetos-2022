import java.util.Scanner;
public class Estudos_Classe 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		Homem homem = new Homem("Carlos");
		Cao cao = new Cao("bidu");
		Gato gato = new Gato("Teo");
		System.out.println(homem.getFala());
		System.out.println(cao.getFala());
		System.out.println(gato.getFala());
		homem.setFala("Meu nome é Carlos");
		System.out.println(homem.getFala());
		System.out.println(homem.getNome());
		Homem homens[] = new Homem[5];
		for(int i = 0; i < 5; i++) 
		{
			System.out.println("Digite um nome");
			homens[i] = new Homem(entrada.nextLine());
			System.out.println(homens[i].getNome());
		}
	}
}