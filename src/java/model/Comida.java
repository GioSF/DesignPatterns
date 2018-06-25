/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gsf
 */
public class Comida {
    
    private int id;
    private String nome;
    private String tipoComida;
    private float valor;
    private int qdade;
    
    public Comida(){};
    
    public Comida(int id, String nome, String tipoComida, float valor){
        this.id = id;
        this.nome = nome;
        this.tipoComida = tipoComida;
        this.valor = valor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tipo
     */
    public String getTipoComida() {
        return tipoComida;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the qdade
     */
    public int getQdade() {
        return qdade;
    }

    /**
     * @param qdade the qdade to set
     */
    public void setQdade(int qdade) {
        this.qdade = qdade;
    }
    
    
}