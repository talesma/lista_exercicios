import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = input.nextInt();

        if (numero%2==0) {
            System.out.println("O número " +numero+ " é par.");
        } else {
            System.out.println("O número " +numero+ " é ímpar.");
        }

        input.close();

    }
    
}
