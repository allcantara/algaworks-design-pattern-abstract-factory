package org.algaworks.notafiscal.mg;

import org.algaworks.notafiscal.NotaFiscal;

public class MinasGeraisNFe implements NotaFiscal {

    @Override
    public void emitir(String documento, String nomeCliente, String endereco) {
        System.out.println("Minas Gerais - Emitindo NFe " + documento + " para " + nomeCliente + " em " + endereco);
    }

}
