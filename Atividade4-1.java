import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Voce e maior de idade.");
        } else {
            System.out.println("Voce e menor de idade.");
        }

        scanner.close();
    }
}
