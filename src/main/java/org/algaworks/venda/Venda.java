package org.algaworks.venda;

import org.algaworks.notafiscal.NotaFiscal;
import org.algaworks.pagamento.Pagamento;

import java.io.IOException;
import java.math.BigDecimal;

public class Venda {

    private final NotaFiscal notaFiscal;
    private final Pagamento pagamento;

    public Venda(VendaFactory factory) {
        this.notaFiscal = factory.criarNotaFiscal();
        this.pagamento = factory.criarPagamento();
    }

    public void realizar() {
        String documento = "123";
        String nomeCliente = "Bruno";
        String endereco = "Rua 1";

        this.notaFiscal.emitir(documento, nomeCliente, endereco);
        this.pagamento.solicitar(documento, nomeCliente, new BigDecimal("100.0"));
    }

}
