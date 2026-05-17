package Exercicious;
import  java.util.Scanner;
public class CalculadoraDeDescontoLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua categoria de cliente(Bronze/Prata/Ouro)? ");
        String categoria = scanner.next().toUpperCase();
        System.out.print("Qual é o valor da compra? ");
        double valorCompra = scanner.nextDouble();
        System.out.print("É seu aniversário(Sim/Não)? ");
        String aniversario = scanner.next().toUpperCase();

        double desconto;
        double economia=0;
        double valorapagar=0;

        if (categoria.equals("BRONZE")) {
            desconto= 5;
        } else if (categoria.equals("PRATA")) {
            desconto= 10;

        }else{
            desconto= 15;
        }

        if (aniversario.equals("SIM")) {
            desconto= desconto+10;
        }
        if (valorCompra > 500) {
            desconto= desconto+5;
        }

        economia= valorCompra * (desconto/100);
        valorapagar= valorCompra-economia;

        System.out.printf("Desconto Aplicado: %.0f%%%n", desconto);
        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Você economizou: R$ %.2f%n", economia);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorapagar);

         scanner.close();
    }
}
