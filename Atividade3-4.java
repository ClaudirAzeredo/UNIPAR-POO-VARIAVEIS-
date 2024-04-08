import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiraNota, segundaNota, terceiraNota, quartaNota;

        System.out.println("Digite a primeira nota:");
        primeiraNota = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        segundaNota = scanner.nextInt();
        
        System.out.println("Digite a terceira nota:");
        terceiraNota = scanner.nextInt();
        
        System.out.println("Digite a quarta nota:");
        quartaNota = scanner.nextInt();

  int media = (primeiraNota+segundaNota+terceiraNota +quartaNota)/4;
        
        System.out.println("Media: " + media);

        scanner.close();
    }
}

