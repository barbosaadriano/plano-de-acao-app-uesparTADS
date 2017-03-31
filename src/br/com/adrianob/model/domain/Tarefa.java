package br.com.adrianob.model.domain;

import br.com.adrianob.model.dao.DaoSituacao;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Tarefa {
    
    private String titulo;
    private String descricao;
    private Date inicioPrevisto;
    private Date fimPrevisto;
    private Date inicio;
    private Date fim;
    private Date fimRenegociado;
    private String observacao;
    private float indice;
    
    private Situacao situacao;
    private Responsavel responsavel;
    
    public Tarefa() {
        DaoSituacao ds = new DaoSituacao();
        this.situacao = ds.getSituacao(ds.PLANEJADA);
        this.responsavel = new Responsavel();
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
    
    public Date getInicioPrevisto() {
        return inicioPrevisto;
    }
    
    public void setInicioPrevisto(Date inicioPrevisto) {
        this.inicioPrevisto = inicioPrevisto;
    }
    
    public Date getFimPrevisto() {
        return fimPrevisto;
    }
    
    public void setFimPrevisto(Date fimPrevisto) {
        this.fimPrevisto = fimPrevisto;
    }
    
    public Date getInicio() {
        return inicio;
    }
    
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    
    public Date getFim() {
        return fim;
    }
    
    public void setFim(Date fim) {
        this.fim = fim;
    }
    
    public Date getFimRenegociado() {
        return fimRenegociado;
    }
    
    public void setFimRenegociado(Date fimRenegociado) {
        this.fimRenegociado = fimRenegociado;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public float getIndice() {
        return indice;
    }
    
    public void setIndice(float indice) {
        this.indice = indice;
    }
    
    public Situacao getSituacao() {
        return situacao;
    }
    
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
    public Responsavel getResponsavel() {
        return responsavel;
    }
    
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    
}
