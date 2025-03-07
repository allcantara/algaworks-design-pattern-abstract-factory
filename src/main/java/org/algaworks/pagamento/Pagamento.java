package org.algaworks.pagamento;

import java.math.BigDecimal;

public interface Pagamento {

    void solicitar(String documento, String nomeCliente, BigDecimal valor);

}
