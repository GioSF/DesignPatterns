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

}
