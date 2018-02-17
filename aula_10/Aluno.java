package aula_10;

public class Aluno extends Pessoa{
	
	private Turno turno;
	

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}	
	


	@Override
	public String toString() {
		return super.toString() // Aqui estamos usando o toString da classe pessoa e depois o toString aqui de Aluno
				+ "[========= Turno = " + turno +"\n"
				+ "[==============================================================]\n";
	}

}
