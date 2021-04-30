import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void venda(Produto produto) {  	
    	try {
    		if(temEstoque(produto)) {
            	produto.possuiPromocao();
                System.out.println("Realizada a venda");
            } else {
                System.out.println("Não foi possivel concretizar a venda");
            }
    	}
    	catch(NullPointerException ex){
    		System.out.println("Error: " + "Não pode passar um produto não existente");
    	}
        
    }

    public boolean temEstoque(Produto produto) {
    	boolean estoque = false;
    	if(produto.getQuantidade() > 0) {
    		System.out.println("Possui no estoque");
    		estoque = true;
    	}
    	else {
    		System.out.println("Não Possui no estoque");
    		estoque = false;
    	}
    	return estoque;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "Produtos=" + produtos +
                '}';
    }
}
