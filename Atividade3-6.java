import java.util.Scanner;

public class SistemaDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto:");
        double precoProduto = scanner.nextDouble();

        
        System.out.println("Digite o percentual de desconto (%):");
        double percentualDesconto = scanner.nextDouble();

        
        double novoPreco = precoProduto * (1 - percentualDesconto / 100);

       
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Novo Preco com Desconto: R$" + novoPreco);

        scanner.close();
    }
}
