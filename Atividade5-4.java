import java.util.Scanner;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorMaior200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + " numero:");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else {
                contadorMaior200++;
            }
        }

        System.out.println("Quantidade de numeros entre 0 e 100: " + contador0a100);
        System.out.println("Quantidade de numeros entre 101 e 200: " + contador101a200);
        System.out.println("Quantidade de numeros maiores que 200: " + contadorMaior200);

        scanner.close();
    }
}
