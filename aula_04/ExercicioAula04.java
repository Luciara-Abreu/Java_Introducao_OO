package aula_04;

public class ExercicioAula04 {	
	int a;
	int b = 0;

	void tabuada(int a, int b) {
		int mult = a*b;
		System.out.println("A tabuada do "+ a + "*" + b +  " é = " +mult);	
		}
	

	public static void main(String[] args) {
		ExercicioAula04 tab = new ExercicioAula04();
		
		for(int i = 0; i < 11; i++) {
			tab.tabuada(4, i);
			
		}
		
	}

}
