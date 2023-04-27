
public class Gato extends Animal {
	private String fala = "miau";
	Gato(String nome)
	{
		super(nome);
	}
	public String getFala() 
	{
		return fala;
	}
	
	public void setFala(String fala) 
	{
		this.fala = fala;
	}
}
