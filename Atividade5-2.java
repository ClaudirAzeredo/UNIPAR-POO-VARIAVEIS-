import java.util.Scanner;

public class MusicaXuxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Digite o numero inicial de patinhos:");
        int numeroPatinhos = scanner.nextInt();

        while (numeroPatinhos > 0) {
            
            System.out.println(numeroPatinhos + " patinhos foram passear");
            System.out.println("Alem das montanhas");
            System.out.println("Para brincar");
           
            System.out.println("A mamae gritou: Qua, qua, qua, qua");
            
            numeroPatinhos--;
            
            if (numeroPatinhos > 0) {
                System.out.println("Mas so " + numeroPatinhos + " patinhos voltaram de la");
                System.out.println(); 
            }
        }
       
        System.out.println("A mamae patinha foi procurar");
        System.out.println("Alem das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamae gritou: Qua, qua, qua, qua");
        System.out.println("E os " + numeroPatinhos + " patinhos voltaram de la");

        scanner.close();
    }
}
