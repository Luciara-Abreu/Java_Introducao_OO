package aula_07;

public class Aula {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Maria");
		p1.setIdade(20);
		
		System.out.println("O nome da pessoa � " + p1.getNome());
		System.out.println("A idade da "+ p1.getNome() + " �  "+ p1.getIdade());
		
		System.out.println("============================================");
		
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Joana");
		p2.setIdade(10);// se eu colocar menor que zero vai salvar zero por causa da regra de neg�cio que eu coloquei no argumento SET idade na classe Pessoa
		
		System.out.println("O nome da pessoa � " + p2.getNome());
		System.out.println("A idade da "+ p2.getNome() + " �  "+ p2.getIdade());
		
		

	}

}
