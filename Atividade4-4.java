import java.util.Scanner;

public class VerificacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o primeiro numero inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero (" + numero1 + ") e maior que o segundo numero (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo numero (" + numero2 + ") e maior que o primeiro numero (" + numero1 + ").");
        } else {
            System.out.println("Os dois numeros sao iguais (" + numero1 + ").");
        }

        scanner.close();
    }
}
