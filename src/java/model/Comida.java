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
    
    private int id_Comida;
    private String nomeComida;
    private int id_Cozinha;
    private float valorComida;
    private int qdadeComida;

    /**
     * @return the id_Comida
     */
    public int getId_Comida() {
        return id_Comida;
    }

    /**
     * @param id_Comida the id_Comida to set
     */
    public void setId_Comida(int id_Comida) {
        this.id_Comida = id_Comida;
    }

    /**
     * @return the nomeComida
     */
    public String getNomeComida() {
        return nomeComida;
    }

    /**
     * @param nomeComida the nomeComida to set
     */
    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

    /**
     * @return the id_Cozinha
     */
    public int getId_Cozinha() {
        return id_Cozinha;
    }

    /**
     * @param id_Cozinha the id_Cozinha to set
     */
    public void setId_Cozinha(int id_Cozinha) {
        this.id_Cozinha = id_Cozinha;
    }

    /**
     * @return the valorComida
     */
    public float getValorComida() {
        return valorComida;
    }

    /**
     * @param valorComida the valorComida to set
     */
    public void setValorComida(float valorComida) {
        this.valorComida = valorComida;
    }

    /**
     * @return the qdadeComida
     */
    public int getQdadeComida() {
        return qdadeComida;
    }

    /**
     * @param qdadeComida the qdadeComida to set
     */
    public void setQdadeComida(int qdadeComida) {
        this.qdadeComida = qdadeComida;
    }
    
}