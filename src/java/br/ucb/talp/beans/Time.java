package br.ucb.talp.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author leonardo
 */
public class Time implements Serializable{
    public static final long serialVersionUID = 46433L;
    
    private String nome;
    
    private int anoFundacao;
    
    private int numeroIntegrantes;
    
    public Time(){}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + this.anoFundacao;
        hash = 59 * hash + this.numeroIntegrantes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj != null && obj instanceof Time){
           return ((Time)obj).nome.equals(getNome());
       }
        return false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }
}
