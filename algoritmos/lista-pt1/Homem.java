
public class Homem extends Animal 
{
	private String fala = "oi";
	Homem(String nome)
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
