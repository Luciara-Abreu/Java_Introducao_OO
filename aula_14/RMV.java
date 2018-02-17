package aula_14;

public class RMV implements PlayerVideo{
	
	@Override
	public void play() {
		System.out.println("Play....");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop!");		
	}

	@Override
	public void pause() {
		System.out.println("Pause..");		
	}

	@Override
	public void volume(int volume) {
		System.out.println("Volume: " + volume);		
	}

	@Override
	public void taxaDeBits() {
		System.out.println("128 Bits");		
	}

	@Override
	public void taxaDeQuadros() {
		System.out.println("24 q/s");			
	}

	@Override
	public void nomeArquivo(String nomeArquivo) {
		System.out.println("Arquivo " + nomeArquivo);		
	}

}
