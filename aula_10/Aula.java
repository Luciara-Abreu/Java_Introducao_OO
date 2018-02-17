package aula_10;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno();
		a1.setDtaNascimento(LocalDate.of(1977, 8, 22));
		a1.setNome("Luciara");
		a1.setSobrenome("Abreu");
		a1.setSexo('F');
		a1.setTurno(Turno.MANHA);
		
		
		System.out.println("[===================== Dados do Aluno =========================]\n" + a1.toString());
		
		Professor p1 = new Professor();
		p1.setDtaNascimento(LocalDate.of(1970, 5, 17));
		p1.setNome("Jessica");
		p1.setSobrenome("Andrade");
		p1.setSexo('F');
		p1.setHoras(Horas.QUARENTA_HORAS);
		p1.setDiciplina(Diciplina.FISICA);
		
		System.out.println("[========================== Dados do Professor ================]\n" + p1.toString());
		

	}

}
