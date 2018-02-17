package aula_15;

public class Pessoa {
	
	private String nome;
	
	public Pessoa () {
		super();
		
		System.out.println("Pessoa");

	}

	public Pessoa(String nome) {
		this();
		this.nome = nome;
		
		System.out.println("Pessoa (String nome)");

	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
