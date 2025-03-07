package org.algaworks.pagamento.bancobrasil;

import org.algaworks.pagamento.Pagamento;

import java.math.BigDecimal;

public class BancoDoBrasilBoleto implements Pagamento {

    @Override
    public void solicitar(String documento, String nomeCliente, BigDecimal valor) {
        System.out.println("Banco do Brasil - Solicitando pagamento via boleto de " + valor + " para " + nomeCliente);
    }

}
