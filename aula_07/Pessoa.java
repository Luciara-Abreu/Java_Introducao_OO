package aula_07;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
		
	}		

}
