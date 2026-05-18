package Exercicious;
import java.util.Scanner;
public class AprovaçaodeCredito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua renda mensal: ");
        double rendamensal = input.nextDouble();

        System.out.print("Qual seria o valor do crédito? ");
        double valorcredito = input.nextDouble();

        System.out.print("Qual é o seu Score de Credito? ");
        double scoreCredito = input.nextDouble();
        input.nextLine();
        System.out.print("Tem dívidas: ");
        String temdevidas = input.nextLine().toLowerCase();


        String classificacao;
        String resultado = "";
        double maximasolicitaçao = (double) 30 /100;
        double valorparanegar = rendamensal * maximasolicitaçao;
        if (scoreCredito>700){
            classificacao = "Bom";
        }else if (scoreCredito>=400  && scoreCredito<=700){
            classificacao = "Regular";
        }else {
            classificacao = "Ruim";
        }
        if (classificacao.equals("Ruim") || valorcredito > valorparanegar) {
            resultado = "Negado";
        } else if (classificacao.equals("Bom") && temdevidas.equals("não")) {
            resultado = "Aprovado";
        } else if (classificacao.equals("Bom") && temdevidas.equals("sim")) {
            resultado = "Aprovado com restrição";
        } else if (classificacao.equals("Regular") && temdevidas.equals("não")) {
            resultado = "Aprovado com restrição";
        } else if (classificacao.equals("Regular") && temdevidas.equals("sim")) {
            resultado = "Negado";
        }

        System.out.println("Resultado: " + resultado);
    }
}
