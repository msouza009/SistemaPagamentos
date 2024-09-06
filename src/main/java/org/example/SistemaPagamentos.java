package org.example;

public class SistemaPagamentos {
    public static void  main (String[] args) {

        Pix pgPix = new Pix();
        Pagamentos pgCartao = new CartaoCredito();
        Pagamentos pgBit = new Bitcoin();


        processar(pgCartao, 109.00);
        processar(pgPix, 10.00);
        processar(pgBit, 0.87);
    }

    public static void processar(Pagamentos p, double valor) {
        p.processarPagamento(valor);
    }
}
