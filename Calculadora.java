import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float num1;
        float num2;
        int cálculo;
        float resultado;

        System.out.println("Digite um número:");
        num1 = input.nextInt();
        System.out.println("Digite outro número:");
        num2 = input.nextInt();

        System.out.println("Escolha uma operação matemática para efetuar o cálculo");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        cálculo = input.nextInt();

        if (cálculo == 1) {
            resultado = num1 + num2;
            System.out.println("Você escolheu SOMA, o resultado de " +num1+ " + " +num2+ " é " +resultado);
        } else if (cálculo == 2) {
            resultado = num1 - num2;
            System.out.println("Você escolheu SUBTRAÇÃO, o resultado de " +num1+ " - " +num2+ " é " +resultado);
        } else if (cálculo == 3) {
            resultado = num1 * num2;
            System.out.println("Você escolheu MULTIPLICAÇÃO, o resultado de " +num1+ " * " +num2+ " é " +resultado);
        } else if (cálculo == 4) {
            resultado = num1 / num2;
            System.out.println("Você escolheu DIVISÃO, o resultado de " +num1+ " / " +num2+ " é " +resultado);
        } else {
            System.out.println("OPERAÇÃO MATEMÁTICA INVÁLIDA!");
        }

        input.close();

    }
}