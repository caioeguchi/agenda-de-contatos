package com.caionilson.core.tema6;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgendaTest {

    private Agenda agenda;
    private Contato c1;
    private Contato c2;
    private Contato novoContato;

    @Before
     public void init() {

        agenda = new Agenda();

        c1 = new Contato("Enzo", "12345678");
        c2 = new Contato("Caio", "27091995");
        novoContato = new Contato("Teste", "98765432");

        agenda.adicionarContatos(c1);
        agenda.adicionarContatos(c2);

    }

    @Test
    public void testeParaSaberSeOsContatosEstaoSendoAdicionadosNaLista() {
        agenda.adicionarContatos(novoContato);
        Assert.assertTrue(agenda.getAgenda().contains(novoContato));
    }
    
    @Test
    public void testeDaOpcaoDeBuscaDoNome() {
        Assert.assertTrue(agenda.buscaNome(c1.getNome()).contains(c1));
    }
    
    @Test
    public void testeParaSaberSeONomeNAOEstaSendoBuscado() {
        Assert.assertFalse(agenda.buscaNome(novoContato.getNome()).contains(novoContato));
    }
    
    @Test
    public void testeDaOpcaoDeBuscaPeloID() {
        Assert.assertTrue(agenda.buscaId(c2.idContato()).isPresent());
        Assert.assertTrue(agenda.buscaId(c1.idContato()).isPresent());
    }

    @Test
    public void testeSeABuscaPeloIdEstaAchandoUmId() {
        Assert.assertFalse(agenda.buscaId(novoContato.idContato()).isPresent());
    }
    
    @Test
    public void testeParaSaberSeOsContatosEstaoSendoListados() {
        Assert.assertTrue(agenda.getAgenda().contains(c1));
        Assert.assertTrue(agenda.getAgenda().contains(c2));
        Assert.assertEquals(2, agenda.getAgenda().size());
    }
    
    @Test
    public void testandoSeOsContatosEstaoSendoRemovidos() {
        agenda.removerContatos(agenda.getAgenda().get(0).getIdContato());
        assertEquals(1, agenda.getAgenda().size());
    }
}
