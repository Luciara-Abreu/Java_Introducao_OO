package aula_08;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private char sexo;
	
	public Pessoa() {
		super();
		System.out.println("1) Nenhum argumento");
	}
	
	public Pessoa(String nome) {
		//this(); --> o This imprimeo oque estiver no primeiro construtor
		this.nome = nome;
		System.out.println("2) Passando 1 argumento");
	}

	public Pessoa(String nome, String sobrenome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		System.out.println("3) Passando 4 argumentos");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome 
				+ "|Sobrenome = " + sobrenome
				+ "| Idade = " + idade
				+ "| Sexo = " + sexo;				
	}


}
