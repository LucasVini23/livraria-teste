public class Chaveiros extends Produto implements PromocoesChaveiro{
	
	private String marca;
	private String dimensaoDoProduto;
	private String cor;
	
	public Chaveiros(String descricao, double preco, int quantidade, String marca, String dimensaoDoProduto, String cor) {
		super(descricao, preco, quantidade);
		this.marca = marca;
		this.dimensaoDoProduto = dimensaoDoProduto;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public String getDimensaoDoProduto() {
		return dimensaoDoProduto;
	}

	public String getCor() {
		return cor;
	}
	
	@Override
	public void possuiPromocao() {
		if(ofertasPorCor() || ofertasPorMarca()) {
			System.out.println("Este produto possui uma oferta");
		}
	}
	
	@Override
	public boolean ofertasPorMarca() {
		if(marca == "Fabrica Geek") {
			System.out.println("Oferta de 10%");
			promocao = true;
		}
		return promocao;
	}
	
	@Override
	public boolean ofertasPorCor() {
		if(cor == "Azul") {
			System.out.println("Oferta de 5%");
			promocao = true;
		}
		return promocao;
	}

	
	

}
