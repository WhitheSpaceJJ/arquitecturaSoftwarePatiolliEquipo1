/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Objects;

/**
 *
 * @author Soulshiryu
 */
public class juego {
    private String cambio;
    private String Cambio2;
    @Override
    public String toString() {
        return "juego{" + "apuesta=" + apuesta + ", tama\u00f1otb=" + tamañotb + ", cantidadaq=" + cantidadaq + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.apuesta);
        hash = 83 * hash + Objects.hashCode(this.tamañotb);
        hash = 83 * hash + Objects.hashCode(this.cantidadaq);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final juego other = (juego) obj;
        if (!Objects.equals(this.apuesta, other.apuesta)) {
            return false;
        }
        if (!Objects.equals(this.tamañotb, other.tamañotb)) {
            return false;
        }
        if (!Objects.equals(this.cantidadaq, other.cantidadaq)) {
            return false;
        }
        return true;
    }

    public String getApuesta() {
        return apuesta;
    }

    public void setApuesta(String apuesta) {
        this.apuesta = apuesta;
    }

    public String getTamañotb() {
        return tamañotb;
    }

    public void setTamañotb(String tamañotb) {
        this.tamañotb = tamañotb;
    }

    public String getCantidadaq() {
        return cantidadaq;
    }

    public void setCantidadaq(String cantidadaq) {
        this.cantidadaq = cantidadaq;
    }
private String apuesta, tamañotb,cantidadaq;

    public juego(String apuesta, String tamañotb, String cantidadaq) {
        this.apuesta = apuesta;
        this.tamañotb = tamañotb;
        this.cantidadaq = cantidadaq;
    }

  
     
}
