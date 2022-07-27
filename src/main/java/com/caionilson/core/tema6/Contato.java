package com.caionilson.core.tema6;

public class Contato {

    private String nomeContato;
    private String telefoneContato;
    private int idContato;
    private static int idContatos = 1;

    public Contato() {
    }

    public Contato(String nome, String telefone) {
        this.nomeContato = nome;
        this.telefoneContato = telefone;
        this.idContato = idContatos++;
    }

    public String getNome() {
        return nomeContato;
    }

    public void setNome(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public int idContato() {
        return idContato;
    }

    @Override
    public String toString() {
        return  "ID: " + this.idContato +
        		"\nNome: " + this.nomeContato +
                "\nTelefone: " + this.telefoneContato;
    }
}
