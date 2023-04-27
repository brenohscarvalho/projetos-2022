
abstract class Animal 
{
	 private String nome;
	 Animal(String nome)
	 {
		 this.nome = nome;
	 }
	 
	 public void setNome(String nome) 
	 { 
		this.nome = nome; 
	 }
	 
	 public String getNome() 
	 {
		return nome; 
	 }
	 public abstract String getFala(); 
}
