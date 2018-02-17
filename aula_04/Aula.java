package aula_04;

public class Aula {
	
	int x = 1;
	String y = "Ola ";
	String z = "Mundo!!";
	
	void soma(int a, int b) {
		int soma = a+b;
	System.out.println("A soma é: " +soma);	
	}
	
	int subtracao(int a, int b) {
		return a - b;
	}
	
	public static void main(String args[]) {
		
		Aula a = new Aula();
		int x2 = a.x +2;
		
		System.out.println("Valor de x: " + a.x);
		System.out.println("Valor de X2: " + x2);
		System.out.println(a.y + "" + a.z);
		
		a.soma(5, 2);
		a.subtracao(5, 20);
		
		int sub = a.subtracao(50, 30);
		System.out.println("A subtração é: " +sub);
		
		for(int i = 0; i < 5; i++) {
			a.soma(x2, i);
			
		}
	}

}
