public class ClasseTesteEtapa4 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Av. Central", "Porto Alegre", "RS", "Brasil", "90000-000", "100", "Centro");
        Endereco endereco2 = new Endereco("Rua das Rosas", "Florianópolis", "SC", "Brasil", "88000-000", "45", "Bloco A");

        Loja lojaVest = new Vestuario("Fashion Store", endereco2);
        lojaVest.insereProduto(new Produto("Camiseta", 49.99, 10));
        lojaVest.insereProduto(new Produto("Calça Jeans", 89.90, 5));

        Loja lojaInfo = new Informatica("TechPlace", endereco1);
        lojaInfo.insereProduto(new Produto("Notebook", 2999.99, 3));
        lojaInfo.insereProduto(new Produto("Mouse Gamer", 199.90, 10));

        Shopping shopping = new Shopping("Shopping Sul", endereco1);
        shopping.insereLoja(lojaVest);
        shopping.insereLoja(lojaInfo);

        System.out.println(shopping);
        System.out.println("Lojas de informática: " + shopping.quantidadeLojasPorTipo("Informatica"));
    }
}
