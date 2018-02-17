package aula_08;

public class Aula {

	public static void main(String[] args) {
		/*Livro l1 = new Livro();
		l1.setTitulo("Java 1");
		l1.setAutor("Luciara");
		l1.setPaginas(200);
		l1.setLancamento(false);
		System.out.println(l1.toString());
		
		Livro l2 = new Livro("Java 2");
		System.out.println(l2.toString());
		
		Livro l3 = new Livro(77);
		System.out.println(l3.toString());
		
		Livro l4 = new Livro("Java 4","Beltrano",50, true);
		System.out.println(l4.toString());*/
		
		Pessoa p1 = new Pessoa();
		System.out.println(p1.toString());
				
		Pessoa p2 = new Pessoa("Fulana");		
		System.out.println(p2.toString());
		
		Pessoa p3 = new Pessoa("Luci","Santos",35, (char) 1 );
		System.out.println(p3.toString());

	}

}
