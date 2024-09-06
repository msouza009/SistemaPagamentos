package org.example;

public class SistemaPagamentos {
    public static void  main (String[] args) {

        Pix pgPix = new Pix();
        Pagamentos pgCartao = new CartaoCredito();


        processar(pgCartao, 109.00);
        processar(pgPix, 10.00);
    }

    public static void processar(Pagamentos p, double valor) {
        p.processarPagamento(valor);
    }
}
