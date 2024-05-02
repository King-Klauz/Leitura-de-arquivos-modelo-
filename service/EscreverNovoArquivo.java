package service;

import model.Servidor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverNovoArquivo {
    public static  <T> void escreverArquivo(ArrayList<T> listaDeEscrita) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter("data\\relatório2.csv"));
        escritor.write(cabecalhoArquivo());
        for (T t : listaDeEscrita) {
            escritor.write(regraDeEscrita((Servidor) t));
        }

        escritor.close();
    }

    public static String cabecalhoArquivo(){
        return "DataFormatada;DataFimFormatada;Exerc;Comarca-exe;Matricula;Nome;origem;comarca-orig;exe-his;Descricao;Descricao;Descricao\n";
    }

    public static String regraDeEscrita(Servidor servidor){
        return servidor.getDataInical()+";"+ servidor.getDataFinal()+";"+servidor.getLotacaoExercicio()+";"+servidor.getComarcaExercicio()+";"+servidor.getMatricula()+";"+
                servidor.getNome()+";"+servidor.getLotacaoOrigem()+";"+servidor.getComarcaOrigem()+";"+servidor.getExe_his()+";"+servidor.getTipoMovimentacao()+";"+
                servidor.getCargoEfetivo()+";"+ servidor.getTipoServidor()+"\n";
    }
}
