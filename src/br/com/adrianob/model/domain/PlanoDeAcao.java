package br.com.adrianob.model.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class PlanoDeAcao {

    private String tema;
    private String descricao;
    private List<Acao> acoes;

    public PlanoDeAcao() {
        this.acoes = new ArrayList<Acao>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Acao> acoes) {
        this.acoes = acoes;
    }

}
