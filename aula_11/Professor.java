package aula_11;

public class Professor extends Pessoa {
	
	@Override
	public void setMatricula(String matricula) {
		if(matricula.length() == 8) {
			super.setMatricula(matricula);
		}else {
			super.setMatricula("Matricula inv�lida para Professor");
		}
	}
}
