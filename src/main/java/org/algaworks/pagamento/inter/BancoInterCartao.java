package org.algaworks.pagamento.inter;

import org.algaworks.pagamento.Pagamento;

import java.math.BigDecimal;

public class BancoInterCartao implements Pagamento {

    @Override
    public void solicitar(String documento, String nomeCliente, BigDecimal valor) {
        System.out.println("Banco Inter - Solicitando pagamento via cartão de " + valor + " para " + nomeCliente);
    }

}
