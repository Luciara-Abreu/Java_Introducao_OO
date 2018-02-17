package aula_14;

public interface Player {
	/*
	 metodos abstratos serão sempre publicos mesmo que a palavra public esteja implicita
	 Todos os metodos dentro de uma interface serão metodos abstratos mesmo que a palavra abstract esteja implicita
	 */
	
	public abstract void play();	
			abstract void stop();
				     void pause();
				     void volume(int volume);

}
