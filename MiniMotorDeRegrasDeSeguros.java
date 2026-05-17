package Exercicious;
import  java.util.Scanner;
public class MiniMotorDeRegrasDeSeguros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Qual é o tipo do veículo(Moto/Carro/Caminhão)? ");
        String veiculo = sc.next().toUpperCase();
        System.out.print("Quantidade de acidentes nos últimos 5 anos? ");
        int acidentes = sc.nextInt();
        System.out.print("Voçê reside em capital ou interior? ");
        String lugar = sc.next().toUpperCase();

        String classificacao = "";
        int pontos=0;
        double valorApolice = 0;

        if (idade<25){
            classificacao = "Alto";
        } else if (idade>=25 && idade<=60) {
            classificacao = "Baixo";
        }else {
            classificacao = "Médio";
        }

        if (veiculo.equals("MOTO")){
            pontos= 3;
        }else if (veiculo.equals("CARRO")){
            pontos = 1;
        }else {
            pontos = 2;
        }

        if (acidentes == 1) {
            pontos += 2;
        } else if (acidentes >= 2) {
            pontos += 4;
        }

        if (lugar.equals("CAPITAL")){
            pontos = pontos+2;
        }

        if (classificacao.equals("Baixo") && pontos>=0 && pontos<=3){
            valorApolice=1200;
        } else if (classificacao.equals("Médio") && pontos>=4 && pontos<=6 ) {
            valorApolice=2500;
        }else {
            valorApolice=4000;
        }

        System.out.println("Perfil de Risco: "+classificacao);
        System.out.println("Pontuação: "+pontos);
        System.out.printf("Valor da Apólice: R$ %.2f",valorApolice);

        sc.close();
    }
}
