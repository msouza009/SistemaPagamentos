package org.example;


public class Pix implements Pagamentos {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pix processado no valor de " + valor);
    }
}
