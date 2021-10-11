/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author HP
 */
public class Mdfiltros {
    
    private String ID;
    private String name;
    private String color;
    private String habitat;
    private String rate_captura;
    private String exp_base;

    public Mdfiltros(String ID, String name, String color, String habitat, String rate_captura, String exp_base) {
        this.ID = ID;
        this.name = name;
        this.color = color;
        this.habitat = habitat;
        this.rate_captura = rate_captura;
        this.exp_base = exp_base;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the rate_captura
     */
    public String getRate_captura() {
        return rate_captura;
    }

    /**
     * @param rate_captura the rate_captura to set
     */
    public void setRate_captura(String rate_captura) {
        this.rate_captura = rate_captura;
    }

    /**
     * @return the exp_base
     */
    public String getExp_base() {
        return exp_base;
    }

    /**
     * @param exp_base the exp_base to set
     */
    public void setExp_base(String exp_base) {
        this.exp_base = exp_base;
    }
    
}
