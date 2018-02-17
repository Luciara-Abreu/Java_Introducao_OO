package aula_12;

public class Aula {

	public static void main(String[] args) {
		
		
		Programador p = new Programador();
		p.setNome("Roger");
		p.setSalario(2800.00);		
		System.out.printf("Programador é : %s \nSalario R$: %.2f",  p.getNome(), p.calculaSalario());		
		System.out.println("\n");
		 
		Analista a = new Analista();
		a.setNome("Sandra");
		a.setSalario(3300.00);
		System.out.printf("Analista é : %s \nSalario R$: %.2f",  a.getNome(), a.calculaSalario());
		System.out.println("\n");
		
		ImplantadorJunior i = new ImplantadorJunior();
		i.setNome("Andre");
		i.setSalario(2600.00);
		System.out.printf("Implantador JR é : %s \nSalario R$: %.2f",  i.getNome(), i.calculaSalario());
		System.out.println("\n");
		
		
		

	}

}
