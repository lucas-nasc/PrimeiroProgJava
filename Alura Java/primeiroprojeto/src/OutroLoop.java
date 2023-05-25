import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota  = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga a sua avaliação para o filme ou -1 pra encerrar");
            nota = leitura.nextDouble();
            if(nota!= -1){
                media = media + nota;
                totalDeNotas  ++;
            }


        }

        System.out.println("media de avaliações " + media/totalDeNotas);
        int estrelas = (int) (media/totalDeNotas)/2;

        System.out.println("esse filme é " + estrelas + " estrelas");
    }
}
