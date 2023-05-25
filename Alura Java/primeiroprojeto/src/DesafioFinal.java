import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        int contador = 0;
        Scanner numero = new Scanner(System.in);
        Scanner dinheiro = new Scanner(System.in);
        int opcao = 0;
        double soma = 0;
        double saldo = 2500;
        double pix = 0;
        double subtracao = 0;


        String mensagem = """
                *****************************************************
                Dados iniciais do cliente:
                
                Nome:                       Lucas Nascimento Silva 
                tipo de conta:              Corrente
                Saldo Inicial:              R$  2500,00
                *****************************************************
                """;
        String mensagemDois = """
                
                Operações
                
                1- Consultar Saldo
                2 - Receber Valor
                3- Transferencia de valor
                4 - Sair
                """;

        System.out.println(mensagem);



        while (contador < 10){//contador nao sera acrescentado para o programa so parar quando o cliente pedir

            System.out.println(mensagemDois);

            opcao = numero.nextInt();

            if (opcao == 1) {

                System.out.println("Seu saldo é de " + saldo);

            } else if (opcao == 2) {

                System.out.println("Digite o valor que quer receber: ");
                pix =  dinheiro.nextDouble();
                soma = saldo + pix;
                saldo = soma;
                System.out.println("agora voce tem " + soma);
                System.out.println("valor recebido " + pix);

            } else if (opcao == 3) {
                if (subtracao > saldo){
                    System.out.println("voce nao tem esse saldo para transferir, seu saldo é de " + saldo);
                }else {
                    System.out.println("Digite o valor que quer transferir ");
                    pix = dinheiro.nextDouble();
                    subtracao = saldo - pix;
                    saldo = subtracao;
                    System.out.println("Agora voce tem " + subtracao);
                    System.out.println("Valor transferido de " + pix);
                }

            } else if (opcao > 4 || opcao < 1) {

                System.out.println("numero invalido");

            }
            else {

                System.out.println("Voce saiu da conta");
                break;
            }


        }
    }
}
