package org.algaworks.venda;

import org.algaworks.notafiscal.NotaFiscal;
import org.algaworks.pagamento.Pagamento;

public interface VendaFactory {

    NotaFiscal criarNotaFiscal();

    Pagamento criarPagamento();

}
