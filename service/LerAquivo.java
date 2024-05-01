package service;

import model.Servidor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerAquivo {
    public <T> void lerArquivo(ArrayList<T> listaDeServidores) {
        Servidor servidor;
        BufferedReader leitor;
        int codigo = 0;

        try{
            leitor = new BufferedReader(new FileReader(caminhoArquivo())); // CAMINHO PODE SER MUDADO NA FUNCAO -> caminhoArquivo()
            String linha = leitor.readLine();
            while ((linha = leitor.readLine())!=null){
                String[] dividir = new String[0];
                System.out.println(linha);
                listaDeServidores.add((T) regraDeLeitura(linha,dividir));
                codigo++;
            }
            leitor.close();

        }catch(FileNotFoundException file){
            System.out.println("Arquivo não encontrado");
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo");
        }
    }

    public String caminhoArquivo(){
        return "data\\movimentacoes - dados (18).tsv";
    }
    public String caminhoArquivoTest(){
        return "data\\movimentacoes - test.tsv";
    }

    public Servidor regraDeLeitura(String linha, String[] dividir){
        dividir = linha.split("\\t");
        return new Servidor(dividir[0],dividir[1],dividir[2],dividir[3],dividir[4],dividir[5],dividir[6],dividir[7],dividir[8],dividir[9],dividir[10],dividir[11]);
    }
}
