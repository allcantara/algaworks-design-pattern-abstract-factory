package org.algaworks.pagamento.inter;

import org.algaworks.pagamento.Pagamento;

import java.math.BigDecimal;

public class BancoInterBoleto implements Pagamento {

    @Override
    public void solicitar(String documento, String nomeCliente, BigDecimal valor) {
        System.out.println("Banco Inter - Solicitando pagamento via boleto de " + valor + " para " + nomeCliente);
    }

}
