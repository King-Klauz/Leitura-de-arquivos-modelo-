package service;

import model.Servidor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;

public class RegraDeNegocio {
    public static ArrayList<Servidor> logica(ArrayList<Servidor> lista){
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
                                listaDeEscrita.add(servidor);
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
