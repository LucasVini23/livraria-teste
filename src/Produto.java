import java.util.Random;

public abstract class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    protected boolean promocao = false;

    public Produto(String descricao, double preco, int quantidade) {
    	Random rnd = new Random();
    	this.codigo = rnd.nextInt(100);
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

	public int getQuantidade() {
		return quantidade;
	}
	
	public abstract void possuiPromocao();

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

}
