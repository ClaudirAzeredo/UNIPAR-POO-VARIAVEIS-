import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiraNota, segundaNota;

        System.out.println("Digite a primeira nota:");
        primeiraNota = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        segundaNota = scanner.nextInt();


        int media = (primeiraNota + segundaNota) / 2;
        
        System.out.println("Media: " + media);

        scanner.close();
    }
}

