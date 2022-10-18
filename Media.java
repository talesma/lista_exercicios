import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float media;
        String nome_do_aluno;

        System.out.println("Bem-vindo, digite seu nome:");
        nome_do_aluno = input.nextLine();
        System.out.println("Informe sua primeira nota:");
        nota1 = input.nextFloat();
        System.out.println("Informe sua segunda nota:");
        nota2 = input.nextFloat();
        System.out.println("Informe sua terceira nota:");
        nota3 = input.nextFloat();

        media = (nota1+nota2*2+nota3*3)/6;

        if (media >= 90) {
            System.out.println("Aluno(a) " +nome_do_aluno+ ", foi aprovado com uma média A!");
        } else if (media >= 75 && media < 90) {
            System.out.println("Aluno(a) " +nome_do_aluno+ ", foi aprovado com uma média B!");
        } else if (media >= 60 && media <75) {
            System.out.println("Aluno(a) " +nome_do_aluno+ ", foi aprovado com uma média C!");
        } else if (media >= 40 && media < 60) {
            System.out.println("Aluno(a) " +nome_do_aluno+ ", foi reprovado com uma média D!");
        } else if (media < 40) {
            System.out.println("Aluno(a) " +nome_do_aluno+ ", foi reprovado com uma média E!");
        } else {
            System.out.println("Nota inválida.");
        }

        input.close();

    }
    
}
