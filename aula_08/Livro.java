package aula_08;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	private boolean lancamento;
	

	
	public Livro() { // contrutor que ao criar o objeto não pede informações
		super();
		System.out.println("Construtor Default");

	}
	
	public Livro(String titulo) {// construtor que ao criar o objeto temos que passar o titulo
		super();                   // pois nele tem esse solicitação no parametro
		this.titulo = titulo;

	}
	
	public Livro(int paginas) {
		this.paginas = paginas;
	}
	
	// construtor passando todos os Argumentos
	public Livro(String titulo, String autor, int paginas, boolean lancamento) {
		//super();
		this();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lancamento = lancamento;
		System.out.println("Construtor com 4 Argumentos");//primeiro ele imprime o que esta nessa linha 
	}// para depois imprimir a chamada toStriing no objeto

	
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAulor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isLancamento() {
		return lancamento;
	}

	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	
	
	
	@Override
	public String toString() {
		return "Livro[Titulo= " + titulo + "/Autor= "+ autor + "/Paginas= "+ paginas + "/Lançamento= " 
	+ lancamento + "]";
	}
	
		
}
