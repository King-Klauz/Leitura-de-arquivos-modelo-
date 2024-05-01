import model.Servidor;
import service.EscreverNovoArquivo;
import service.LerAquivo;
import service.RegraDeNegocio;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Servidor> listaServidor = new ArrayList<Servidor>();
        LerAquivo test = new LerAquivo();
        test.lerArquivo(listaServidor);
        ArrayList<Servidor> listaDeEscrita = RegraDeNegocio.logica(listaServidor);

        for (Servidor s : listaDeEscrita) {
            System.out.println(s);
        }

        EscreverNovoArquivo.escreverArquivo(listaDeEscrita);
    }
}
