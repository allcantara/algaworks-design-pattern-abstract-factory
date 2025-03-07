package org.algaworks.venda.boleto;

import org.algaworks.notafiscal.NotaFiscal;
import org.algaworks.pagamento.Pagamento;
import org.algaworks.venda.VendaFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class LojaFactoryImpl implements VendaFactory {

    private static final String NFE = "nfe";
    private static final String PAGAMENTO = "pagamento";
    private static final String CONFIG_PROPERTIES = "/config.properties";

    @Override
    public NotaFiscal criarNotaFiscal() {
        try {
            return buscarNotaFiscal();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Pagamento criarPagamento() {
        try {
            return buscarPagamento();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private NotaFiscal buscarNotaFiscal() throws IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        Properties prop = getConfig();
        return (NotaFiscal) Class.forName(prop.getProperty(NFE)).getDeclaredConstructor().newInstance();
    }

    private Pagamento buscarPagamento() throws IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        Properties prop = getConfig();
        return (Pagamento) Class.forName(prop.getProperty(PAGAMENTO)).getDeclaredConstructor().newInstance();
    }

    private Properties getConfig() throws IOException {
        Properties prop = new Properties();
        prop.load(this.getClass().getResourceAsStream(CONFIG_PROPERTIES));
        return prop;
    }

}
