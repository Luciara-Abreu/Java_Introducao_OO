package aula_12;

public abstract class Funcionario {
	
	private String nome;
	private double salario;
	
	// vamos add um metodo abstrato.
	public abstract double calculaSalario(); 
	
	/* Metodos abstratos não possuem chaves por que na classe abstrata 
	 * o metodo não possui corpo. A classe que herda de Funcionário deverá
	 * implementar o metodo abstrato e adicionar ou não um corpo conforme 
	 * necessidade com a regra do negócio
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
