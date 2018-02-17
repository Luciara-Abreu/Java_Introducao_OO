package aula_14;

public class Aula {
	
	private PlayerVideo video;
	
	void Videos() {
		
		video = new WMV(); //video recebe o objeto WMV
		
		video.play();
		video.stop();
		video.pause();
		video.volume(5);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.nomeArquivo("Video Aula.wmv");
		
		System.out.println("\n");
		
		
		video = new RMV();
		
		video.play();
		video.stop();
		video.pause();
		video.volume(7);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.nomeArquivo("Video Aula.rmv");
		
		
	}
	

	public static void main(String[] args) {
		
		new Aula().Videos();
		
		
	/*	Mp3 mp3 = new Mp3();
		mp3.play();
		mp3.pause();
		mp3.volume(5);
		mp3.taxaDeBits();
		mp3.stop();
		
		
		System.out.println("\n");
		AVI avi = new AVI();
		avi.play();
		avi.pause();
		avi.volume(5);
		avi.taxaDeBits();
		avi.stop();
		*/

	}
	
	/* INTERFACES
	 Você cria uma ou mais interfaces, define metodos dentro das
	 interfaces e esses metodos deverão ser implementados dentro das classes
	 que vão trabalhar com as interefaces ou dará erro de execução.
	 	 
	 */

}
