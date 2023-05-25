public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(ano >= 2022 ){
            System.out.println("lançamentos que os clientes estao curtindo!");
        } else{
            System.out.println("filme retrô que vale a pena assistir");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
