package Exercicious;

import java.util.Scanner;

public class SistemaDeClassificacaoDePedidos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o status do pedido (Novo/Pago/Cancelado)? ");
        String status = input.nextLine().toUpperCase();

        System.out.print("Forma de pagamento (PIX/Cartão/Boleto): ");
        String formaPagamento = input.nextLine().toUpperCase();

        System.out.print("Tem estoque disponível? ");
        String temEstoqueDisponivel = input.nextLine().toUpperCase();

        String proximoPasso = "";

        if (status.equals("NOVO")) {

            if (temEstoqueDisponivel.equals("NAO")) {

                proximoPasso = "Notificar cliente: Sem estoque";

            } else if (formaPagamento.equals("BOLETO")) {

                proximoPasso = "Aguardar pagamento";

            } else {

                proximoPasso = "Separar pedido";
            }

        } else if (status.equals("PAGO")) {

            if (temEstoqueDisponivel.equals("SIM")) {

                proximoPasso = "Enviar para entrega";

            } else {

                proximoPasso = "Notificar cliente: Sem estoque";
            }

        } else if (status.equals("CANCELADO")) {

            proximoPasso = "Pedido encerrado";

        } else {

            proximoPasso = "Status inválido";
        }

        System.out.println("Próximo passo: " + proximoPasso);

        input.close();
    }
}