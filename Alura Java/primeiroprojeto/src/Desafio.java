import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int secreto = new Random().nextInt(100);
         Scanner chute = new Scanner(System.in);

        for (int i = 0; i<=5; i++ ){
            System.out.println("Digite seu chute ");
            int numero = chute.nextInt();

            System.out.println("seu numero é: " + numero);

            if (numero == secreto){
                System.out.println("Acertou na mosca");
                break;
            } else if (numero > 100 || numero < 0) {
                System.out.println("numero invalido");

            } else if (numero < secreto) {
                System.out.println("o numero é maior");

            } else{
                System.out.println("o numero é menor");

            }
        }

    }
}
