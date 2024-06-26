package service;

import model.Servidor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class RegraDeNegocio {
    public static ArrayList<Servidor> logica(ArrayList<Servidor> lista) throws ParseException {
        ArrayList<Servidor> listaDeEscrita = new ArrayList<>();
        ArrayList<String> listaDeChecados = new ArrayList<>(); // LISTA USADA PARA CHECAR SE UMA NOME JÁ FOI VERFICADA OU NÃO
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < lista.size(); i++){
            boolean checado = false;
            for (String nome: listaDeChecados){
                if (Objects.equals(nome, lista.get(i).getNome())){
                    checado = true;
                    break;
                }
            }

            if (!checado){
                for (Servidor servidor : lista) {
                    if (lista.get(i).getMatricula().equals(servidor.getMatricula())) {
                        if(!Objects.equals(lista.get(i).getLotacaoExercicio(), servidor.getLotacaoExercicio())){
                            if (!Objects.equals(lista.get(i).getLotacaoOrigem(), servidor.getLotacaoOrigem())) {
                                if(!servidor.getDataFinal().isEmpty()){
                                    Date dataFinal_j = formato.parse(servidor.getDataFinal());
                                    Date dataRange = formato.parse("31/12/2023");
                                    if(dataFinal_j.after(dataRange)){
                                        listaDeEscrita.add(servidor);
                                    }
                                }else{
                                    Date dataRange = formato.parse("31/12/2023");
                                    Date dataInicial = formato.parse(servidor.getDataInical());
                                    if(dataInicial.after(dataRange)){
                                        listaDeEscrita.add(servidor);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            listaDeChecados.add(lista.get(i).getNome());
        }
        return listaDeEscrita;
    }
}
