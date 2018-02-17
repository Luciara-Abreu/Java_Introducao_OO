package aula_13;

public class Aula {
	
	//Variável de instancia Veículo que recebe um veiculo
	private Veiculo veiculo;
	
	// Nesse metodo iremos trabalhar com polimorfismo
	void veiculos() {
		
		veiculo = new Ford();
		veiculo.setCor("Azul");
		veiculo.setPeso(500);
		System.out.println(veiculo.toString());
		
		veiculo = new Yamaha(); // up cast
		veiculo.setCor("Branca");
		veiculo.setPeso(120);
		System.out.println(veiculo.toString());
		
		moto = (Moto) veiculo; // down cast
		moto.setNome("Fazer 300");
		System.out.println(moto.toString() + ", " + moto.getNome());
		

	}
	
	
	private Carro  carro;
	private Moto   moto;
	
	void carrosEMotos() {
		
		carro = new Ford();
		carro.setCor("Verde");
		carro.setPeso(120);
		System.out.println(carro.toString());
		
		moto = new Yamaha();
		moto.setCor("Rosa");
		moto.setPeso(120);
		moto.setNome("Fazer 250");
		System.out.println(moto.toString() + ", "+ moto.getNome());
				
				
	}
	

	public static void main(String[] args) {
		
		new Aula().veiculos();
		new Aula().carrosEMotos();
		
		/*
		Ford f = new Ford();
		f.setCor("Preto");
		f.setPeso(500);		

		// System.out.println("\n");
		System.out.println(f.toString());
		
		Yamaha y = new Yamaha();
		y.setCor("Amarela");
		y.setPeso(100);	
		
		System.out.println(y.toString());
		
	    No código acima não estamos trabalhando com polimorfismo
	    pois cada objeto está trabalhando com tipo dele mesmo
	    ou seja Ford recebe ford e yamaha recebe yamaha
	     
		
		Para trabalhar com polimorfismo nós usaremos a nossa Super classe
		Vamos pensar no veículo primeiro 
		Antes do etodo main vamos criar uma variável de instancia e criar um metodo 
		*/		
		
	}
}
