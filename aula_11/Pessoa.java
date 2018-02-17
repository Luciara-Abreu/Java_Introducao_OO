package aula_11;

public class Pessoa {
	
	private String nome, matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}//ESSE METODO RECEBE UMA VARIAVEL 
	
	/*protected void imprime() {
	 }*/
	
	/*	Para poder sobreescrever e usalos em heranças metodos não podem ser privados
		 *  O metodo aceita como protected e não da erro na classe herdada
		 * sobreescrever metodos primeiro devemos herdar das super class como no caso acima
		 * Podemos sobreescrever metodos 
		 */
	
	
	public Pessoa imprime()	{
		return new Pessoa();
		
	}
}
