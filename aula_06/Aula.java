package aula_06;
import aula_05.ClassB;

public class Aula extends ClassB{

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.pacote = "Pacote a";
		a.protegido = "Protegido a";
		a.publico = "Publlico a";
		
		ClassB b = new ClassB();
		b.publico = "Publico de B";
		
		Aula aula = new Aula();
		aula.protegido = "Protegido de B por herança";
		aula.publico = "Publico de B por herança";
		
		ClassD d = new ClassD();
		d.metodoD();
		// 11:56 do curso
	

	}

}
