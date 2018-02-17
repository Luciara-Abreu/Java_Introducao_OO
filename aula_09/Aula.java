package aula_09;

public class Aula { // AULA DE CONSTANTES
	

	
	public static final String OURO = "OURO";
	public static final String PAUS = "PAUS";
	public static final String COPAS = "COPAS";
	public static final String ESPADAS = "ESPADAS";
	// 4 constantes que são 4 objetos
	
	private static final int VALOR = 0;
	
	public void valor() {
		System.out.println(VALOR);
	}
		
	public static void main(String[] args) {
		
		/*String naipe = Aula.COPAS;
		switch (naipe) {
		
		case Aula.COPAS:
			System.out.println("Sua Carta é de "+ naipe + " =1 Switch USANDO UM DOS OBJETOS DA CLASSE AULA");
			break;
		case Aula.PAUS:
			System.out.println("Sua Carta é de " + naipe + "=1 Switch USANDO UM DOS OBJETOS DA CLASSE AULA");
			break;
		case Aula.OURO:
			System.out.println("Sua Carta é de " + naipe + "=1 Switch USANDO UM DOS OBJETOS DA CLASSE AULA");
			break;
		case Aula.ESPADAS:
			System.out.println("Sua Carta é de " + naipe + " =1 Switch USANDO UM DOS OBJETOS DA CLASSE AULA");
			break;
			
		}	*/
	    
		
	/*	
	Carta carta = Carta.OURO;
	switch (carta) {		
		case COPAS:
			System.out.println("Sua Carta é de "+ carta + " =2 Switch USANDO AS CONSTANTES DA CLASS CARTA");
			break;
		case PAUS:
			System.out.println("Sua Carta é de " + carta + " =2 Switch USANDO AS CONSTANTES DA CLASS CARTA");
			break;
		case OURO:
			System.out.println("Sua Carta é de " + carta + " =2 Switch USANDO AS CONSTANTES DA CLASS CARTA");
			break;
		case ESPADAS:
			System.out.println("Sua Carta é de " + carta + " =2 Switch USANDO AS CONSTANTES DA CLASS CARTA");
			break;		
		
		}	*/
		
		/*
		 A diferença um de outro é que no primeiro criamos 4 objeos estaticos para representar 
		 cada um dos naipes esses objetos são do tipo String.
		 e na classe Carta do tipo Enum criamos somente um objeto Carta onde temos 4  constantes que vão ser do tipo carta
		 
		 */
	
	TrueOrFalse t1 = TrueOrFalse.FALSE; 
	System.out.println(t1);
	System.out.println(t1.getIndex());
	System.out.println(t1.getDesc());
	
	
	for(TrueOrFalse t2: TrueOrFalse.values()) {
		System.out.println(t2);
	}
	
	}// main

}// final da classe
