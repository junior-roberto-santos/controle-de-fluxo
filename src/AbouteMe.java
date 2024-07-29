import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AbouteMe {

        public static void main (String[]args){

            try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola me chamo" + nome.toUpperCase() + "");
        System.out.println("Tenho" + idade + "anos");
        System.out.println("Minha altura é" + altura + "cm");
        scanner.close();
    }
        catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos");
    }
  }
}
