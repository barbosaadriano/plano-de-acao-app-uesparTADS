package br.com.adrianob.model.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Acao {

    private String titulo;
    private String descricao;

    private List<Tarefa> tarefas;

    public Acao() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

}
