import java.util.Scanner;

public class ConverterTemp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float temp;
        float tempC;
        float tempF;
        float tempK;
        int conversão;

        System.out.println("Escolha seu método de conversão:");
        System.out.println("1. Celsius p/ Fahrenheit");
        System.out.println("2. Fahrenheit p/ Celsius");
        System.out.println("3. Celsius p/ Kelvin");
        System.out.println("4. Kelvin p/ Celsius");
        System.out.println("5. Fahrenheit p/ Kelvin");
        System.out.println("6. Kelvin p/ Fahrenheit");
        conversão = input.nextInt();

        System.out.println("Informe a temperatura inicial para a conversão");
        temp = input.nextFloat();

        if (conversão == 1) {
            tempF=temp*1.8f+32;
            System.out.println("O resultado da conversão é " +tempF+ "° Fahrenheit.");
        } else if (conversão == 2) {
            tempC=(temp-32)/1.8f;
            System.out.println("O resultado da conversão é " +tempC+ "° Celsius.");
        } else if (conversão == 3) {
            tempK=temp+273.15f;
            System.out.println("O resultado da conversão é " +tempK+ " Kelvin.");
        } else if (conversão == 4) {
            tempC=temp-273.15f;
            System.out.println("O resultado da conversão é " +tempC+ "° Celsius.");
        } else if (conversão == 5) {
            tempK=(temp-32)/1.8f+273.15f;
            System.out.println("O resultado da conversão é " +tempK+ " Kelvin.");
        } else if (conversão == 6) {
            tempF=(temp-273.15f)*1.8f+32;
            System.out.println("O resultado da conversão é " +tempF+ "° Fahrenheit.");
        }

        input.close();
        
    }
    
}
