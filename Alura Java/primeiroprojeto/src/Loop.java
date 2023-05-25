import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota  = 0;

        for (int i = 0; i< 3 ; i++){
            System.out.println("Diga a sua avaliação para o filme ");
            nota = leitura.nextDouble();
            media = media + nota;

        }

        System.out.println("media de avaliações " + media/3);
        int estrelas = (int) (media/3)/2;

        System.out.println("esse filme é" + estrelas + "estrelas");

    }
}
