import java.util.Scanner;

public class DobroTriplo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float numero;
        float resultado;

        System.out.println("Digite um número positivo ou negativo");
        numero = input.nextFloat();

        if (numero>0) {
            resultado=numero*2;
            System.out.println("O seu número se tornou " +resultado);

        } else if (numero<0) {
            resultado=numero*3;
            System.out.println("Seu número se tornou " +resultado);
        } else {
            resultado=0;
            System.out.println("Seu número é " +resultado);
        }

        input.close();
        }

    }
    
