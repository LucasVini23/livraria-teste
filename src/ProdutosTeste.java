public class ProdutosTeste {

    public static void main(String[] args) {

        Livro livro1 = new Livro("A coragem de ser imperfeito", 28.25, 2,"Brené Brown", 208, "Sextante");
        Livro livro2 = new Livro("O poder do hábito", 31.90, 0, "Charles Duhigg", 408, "Objetiva");
        Chaveiros chaveiro1 = new Chaveiros("Chaveiro Gamer Emborrachado Controle PS", 18.99, 10, "Fabrica Geek", "3 cm x 5 cm", "Multi-colored");
        Chaveiros chaveiro2 = new Chaveiros("Chaveiro Luva De Boxe Punch", 18.06, 5, "Punch", "Unico", "Azul");
        
        Livraria livraria = new Livraria();
        System.out.println("------------------------------ LIVRO 1 ------------------------");
        System.out.println(livro1.toString());
        livraria.venda(livro1);
        System.out.println("------------------------------ LIVRO 2 ------------------------");
        System.out.println(livro2.toString());
        livraria.venda(livro2);
        System.out.println("------------------------------ CHAVEIRO 1 ------------------------");
        System.out.println(chaveiro1.toString());
        livraria.venda(chaveiro1);
        System.out.println("------------------------------ CHAVEIRO 2 ------------------------");
        System.out.println(chaveiro2.toString());
        livraria.venda(chaveiro2);
        livraria.venda(null);
        
        

    }

}
