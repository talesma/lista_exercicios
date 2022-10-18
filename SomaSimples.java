import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float num1;
        float num2;
        float soma;

        System.out.println("Digite um número");
        num1 = input.nextFloat();

        System.out.println("Digite outro número");
        num2 = input.nextFloat();

        soma = (num1+num2);

        System.out.println("A soma dos números é: " +soma);

        input.close();
        
    }
}
