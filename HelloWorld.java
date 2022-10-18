import java.util.Scanner;

public class HelloWorld {
    
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Qual o seu nome?");
        nome = a.nextLine();

        System.out.println("Quantos anos você tem?");
        idade = a.nextInt();

        System.out.println("Olá " +nome+ ", você tem " +idade+ " anos.");

        a.close();
        
    }
}
