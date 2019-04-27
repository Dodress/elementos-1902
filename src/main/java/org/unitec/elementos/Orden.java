package org.unitec.elementos;


public class Orden {
    private String nombreComida;
    private String nombreBebida;

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public Orden() {
    }

    public Orden(String nombreComida, String nombreBebida) {
        this.nombreComida = nombreComida;
        this.nombreBebida = nombreBebida;
    }

    @Override
    public String toString() {
        return "Orden{" + "nombreComida=" + nombreComida + ", nombreBebida=" + nombreBebida + '}';
    }
    
}
