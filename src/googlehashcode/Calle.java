/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode;

/**
 *
 * @author aaron
 */
public class Calle {
    
    private int nodoInicio;
    private int nodoFinal;
    private String nombre;
    private int tiempo;

    public Calle(int nodoInicio, int nodoFinal, String nombre, int tiempo) {
        this.nodoInicio = nodoInicio;
        this.nodoFinal = nodoFinal;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(int nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    public int getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(int nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Calle{" + "nodoInicio=" + nodoInicio + ", nodoFinal=" + nodoFinal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }
    
    
    
    
    
}
