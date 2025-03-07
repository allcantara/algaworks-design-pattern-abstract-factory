package org.algaworks;

import org.algaworks.venda.VendaFactory;
import org.algaworks.venda.Venda;
import org.algaworks.venda.boleto.LojaFactoryImpl;

public class Main {

    public static void main(String[] args) {
        VendaFactory factory = new LojaFactoryImpl();
        Venda venda = new Venda(factory);
        venda.realizar();
    }

}