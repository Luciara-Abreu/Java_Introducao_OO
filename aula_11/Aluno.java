package aula_11;

public class Aluno extends Pessoa {
	
	@Override
	public void setMatricula(String matricula) {
		if (matricula.length()==10) {
			super.setMatricula(matricula);//METODO DA SUPER CLASSE
		}else {
			System.out.println("[==============================================]");
			System.out.println("[Matricula invalida para Aluno = " + getNome()+ "       ]");
		}
		
	}

	@Override
	public Pessoa imprime() {
		return new Pessoa();
	
	}
	

}
