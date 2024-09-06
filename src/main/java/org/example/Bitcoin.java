package org.example;

public class Bitcoin implements Pagamentos {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processa o pagamento via bitcoin " + "no valor de " + valor);
    }
}
