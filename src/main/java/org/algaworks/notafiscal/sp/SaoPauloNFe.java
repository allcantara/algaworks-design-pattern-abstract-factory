package org.algaworks.notafiscal.sp;

import org.algaworks.notafiscal.NotaFiscal;

public class SaoPauloNFe implements NotaFiscal {

    @Override
    public void emitir(String documento, String nomeCliente, String endereco) {
        System.out.println("São Paulo - Emitindo NFe " + documento + " para " + nomeCliente + " em " + endereco);
    }

}
