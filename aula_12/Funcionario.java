package aula_12;

public abstract class Funcionario {
	
	private String nome;
	private double salario;
	
	// vamos add um metodo abstrato.
	public abstract double calculaSalario(); 
	
	/* Metodos abstratos n�o possuem chaves por que na classe abstrata 
	 * o metodo n�o possui corpo. A classe que herda de Funcion�rio dever�
	 * implementar o metodo abstrato e adicionar ou n�o um corpo conforme 
	 * necessidade com a regra do neg�cio
	*/ 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
