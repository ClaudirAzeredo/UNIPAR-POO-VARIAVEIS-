     
     import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
         
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
//Adicionado quais informacoes deverao ser inseridas pelo usuario
        System.out.println("Por favor, informe seus dados:");
        
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        // quebra de linha
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        
        scanner.close();
        

        System.out.println("\nDados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
