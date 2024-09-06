package org.example;

public class CartaoCredito implements Pagamentos {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Cartao de credito" + " processado no valor de " + valor);
    }
}
