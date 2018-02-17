package aula_14;

public class Mp3 implements Player, Audio {

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
	
	
	

}
