package com.caionilson.core.tema6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Agenda {

    private List<Contato> agendaDeContatos = new ArrayList<>();

    public void adicionarContatos(Contato contato) {
        agendaDeContatos.add(contato);
    }

    public void listarContatos() {
        agendaDeContatos.forEach(System.out::println);
    }

    public List<Contato> buscaNome(String nome) {
        return agendaDeContatos.stream().filter(c -> c.getNome().equals(nome)).collect(Collectors.toList());
    }

    public Optional<Contato> buscaId(int id) {
        return agendaDeContatos.stream().filter(contato -> contato.idContato() == id).findAny();
    }

    public void removerContatos(int id) {
        agendaDeContatos.removeIf(c -> c.getIdContato()==id);
    }

    public List<Contato> getAgenda() {
        return agendaDeContatos;
    }
}
