import java.util.Scanner;

public class Compra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int pagamento;
        int parcelas;
        float valor;
        float taxa;
        float juros;
        float resultado;

        valor = 659.9f;
        
        System.out.println("O valor de sua cafeteira é: R$659,90. Escolha sua forma de pagamento:");
        System.out.println("1. Pix/débito/à vista.");
        System.out.println("2. Crédito à vista.");
        System.out.println("3. Crédito parcelado.");
        pagamento = input.nextInt();

        if (pagamento == 1) {
            resultado = valor-(valor*0.1f);
            System.out.println("O valor de sua compra ficou por R$" +resultado);
        } else if (pagamento == 2) {
            System.out.println("O valor de sua compra ficou por R$" +valor);
        } else if (pagamento==3) {
            System.out.println("Em quantas parcelas deseja dividir?");
            parcelas = input.nextInt();
            taxa=0.1f;
            juros=valor*taxa*parcelas;
            resultado=valor+juros;
            System.out.println("O valor de sua compra ficou por R$" +resultado);
        } else {
            System.out.println("Forma de pagamento indisponível.");
        }

        input.close();

    }
    
}
