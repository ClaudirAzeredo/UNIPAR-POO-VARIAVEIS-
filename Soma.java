import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Digite o primeiro numero:");
        primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        segundoNumero = scanner.nextInt();

        int total = primeiroNumero + segundoNumero; 
        
        System.out.println("Soma: " + total);

        scanner.close();
    }
}
