package aula_10;

public class Professor extends Pessoa {
	
	private Horas horas;
	private Diciplina diciplina;
	

	public Horas getHoras() {
		return horas;
	}

	public void setHoras(Horas horas) {
		this.horas = horas;
	}
	public Diciplina getDiciplina() {
		return diciplina;
	}
	
	public void setDiciplina(Diciplina diciplina) {
		this.diciplina = diciplina;
	}
	

	
	@Override
	public String toString() {
		return super.toString() // Aqui estamos usando o toString da classe pessoa e depois o toString aqui de Professor
				+ "[========= Horas = " + horas + "\n"
				+ "[========= Diciplina = " + diciplina + "\n"
				+ "[==============================================================]\n";
	}


}
