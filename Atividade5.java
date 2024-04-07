public class ControleEstoque {
    public static void main(String[] args) {
        
        
        String nomeSmartphone = "Galaxy S21";
        String marcaSmartphone = "Samsung";
        double precoSmartphone = 3500.00;
        int quantidadeEstoqueSmartphone = 50;

        String nomeLaptop = "Dell XPS 13";
        String marcaLaptop = "Dell";
        double precoLaptop = 5000.00;
        int quantidadeEstoqueLaptop = 30;

        String nomeFoneDeOuvido = "AirPods Pro";
        String marcaFoneDeOuvido = "Apple";
        double precoFoneDeOuvido = 1099.99;
        int quantidadeEstoqueFoneDeOuvido = 100;

        
        System.out.println("Dados do Smartphone:");
        System.out.println("Nome: " + nomeSmartphone);
        System.out.println("Marca: " + marcaSmartphone);
        System.out.println("Preco: R$" + precoSmartphone);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoqueSmartphone);
        System.out.println();

        System.out.println("Dados do Laptop:");
        System.out.println("Nome: " + nomeLaptop);
        System.out.println("Marca: " + marcaLaptop);
        System.out.println("Preco: R$" + precoLaptop);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoqueLaptop);
        System.out.println();

        System.out.println("Dados do Fone de Ouvido Bluetooth:");
        System.out.println("Nome: " + nomeFoneDeOuvido);
        System.out.println("Marca: " + marcaFoneDeOuvido);
        System.out.println("Preco: R$" + precoFoneDeOuvido);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoqueFoneDeOuvido);
    }
}
