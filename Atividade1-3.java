import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nomeDoAluno = scanner.nextLine();
    
        System.out.println("Digite a idade do aluno:");
        int idadeDoAluno = scanner.nextInt();
        
        System.out.println("Digite a nota da primeira prova:");
        double notaDaProva1 = scanner.nextDouble();
       
        System.out.println("Digite a nota da segunda prova:");
        double notaDaProva2 = scanner.nextDouble();
      
        double mediaFinal = (notaDaProva1 + notaDaProva2) / 2;

        System.out.println("\nNome do Aluno: " + nomeDoAluno);
        System.out.println("Idade do Aluno: " + idadeDoAluno);
        System.out.println("Nota da Prova 1: " + notaDaProva1);
        System.out.println("Nota da Prova 2: " + notaDaProva2);
        System.out.println("Media Final: " + mediaFinal);

        scanner.close();
    }
}
