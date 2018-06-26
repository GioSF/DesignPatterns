/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gsf
 */
public class Cozinha {
    
    private ArrayList<Pedido> pedidos;
    private String nomeCozinha;
    private int id_Cozinha;
    
    public Cozinha(String nomeCozinha){
        nomeCozinha = this.nomeCozinha;
    }

    /**
     * @return the pedidos
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * @return the nomeCozinha
     */
    public String getNomeCozinha() {
        return nomeCozinha;
    }

    /**
     * @param nomeCozinha the nomeCozinha to set
     */
    public void setNomeCozinha(String nomeCozinha) {
        this.nomeCozinha = nomeCozinha;
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
    
}
