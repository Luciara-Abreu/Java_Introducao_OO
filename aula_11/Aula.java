package aula_11;

public class Aula {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Leandra");
		a1.setMatricula("123456");		
		
		System.out.println("[==============================================]");
		System.out.println("[=== Dados de Matriciula do Aluno =============]");
			System.out.println("[Nome da Aluna é = "+ a1.getNome() + "                     ]\n"
						 + "[Matricula  = " + a1.getMatricula()+ "                             ]");		
		 
		System.out.println("[==============================================]");

		
		Aluno a2 = new Aluno();
		a2.setNome("Jose");
		a2.setMatricula("1234567890");	
		
		System.out.println("[==============================================]");
		System.out.println("[=== Dados de Matriciula do Aluno =============]");
		System.out.println("[Nome da Aluna é = "+ a2.getNome() + "                        ]\n"
						 + "[Matricula  = " + a2.getMatricula()+ "                       ]");		
		
		System.out.println("[==============================================]");
	
		Professor p1 = new Professor ();
		p1.setNome("Carlos");
		p1.setMatricula("12345678");		
	
		System.out.println("[==============================================]");
		System.out.println("[=== Dados de Matriciula do Professor =========]");
		System.out.println("[Nome do Professor é = "+ p1.getNome() + "                  ]\n"
						 + "[Matricula  = " + p1.getMatricula()+ "                         ]");		
		
		System.out.println("[==============================================]");
		
		Professor p2 = new Professor ();
		p2.setNome("Paulo");
		p2.setMatricula("1234567");		
		
		System.out.println("[==============================================]");
		System.out.println("[=== Dados de Matriciula do Professor==========]");
		System.out.println("[Nome do Professor é = "+ p2.getNome() + "                   ]\n"
						 + "[Matricula  = " + p2.getMatricula()+ "]");		
		
		System.out.println("[==============================================]");	
	
		
	}

}
