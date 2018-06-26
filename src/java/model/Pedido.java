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
public class Pedido {
    
    private ArrayList<Comida> comidas;
    private String state;
    private int id_Cliente;
    private int id_Pedido;

    /**
     * @return the comidas
     */
    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    /**
     * @param comidas the comidas to set
     */
    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the id_Cliente
     */
    public int getId_Cliente() {
        return id_Cliente;
    }

    /**
     * @param id_Cliente the id_Cliente to set
     */
    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    /**
     * @return the id_Pedido
     */
    public int getId_Pedido() {
        return id_Pedido;
    }

    /**
     * @param id_Pedido the id_Pedido to set
     */
    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

}
