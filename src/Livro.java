public class Livro extends Produto implements PromocoesLivro{

    private String autor;
    private int numeroPaginas;
    private String editora;

	public Livro(String descricao, double preco, int quantidade, String autor, int numeroPaginas, String editora) {		
		super(descricao, preco, quantidade);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}
	
	@Override
	public void possuiPromocao() {
		if(ofertaPorEditora()) {
			System.out.println("Este produto possui uma oferta");
		}
		
	}
	
	@Override
	public boolean ofertaPorEditora() {
		if(editora == "Sextante") {
			System.out.println("Oferta de 15%");
			promocao = true;
		}
		return promocao;
	}



}
