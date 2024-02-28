// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    
    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);  
     
     System.out.println("Informe o valor em celsius para converter");
     
     int celsius = 0;
     double  fahrenheit = 0.0;
     
     celsius = scanner.nextInt();
     
     System.out.println("Grau Fahrenheit ");
     fahrenheit = scanner.nextDouble();
     
     double grauConvertido = celsius * 9/5+ 32;
     
     System.out.println("O valor convertido eh " + grauConvertido);
     
     scanner.close();
     
     
    }
} 
