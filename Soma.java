import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float a;
        float b;
        float c;

        System.out.println("Digite um número");
        a = input.nextFloat();

        System.out.println("Digite outro número");
        b = input.nextFloat();

        if (a>=b) {
            c=a+b;
            System.out.println("O resultado de " +a+ " + " +b+ " é " +c);
        } else {
            c=a*b; 
            System.out.println("O resultado de " +a+ " * " +b+ " é " +c);
        }

        input.close();
    }
    
}
