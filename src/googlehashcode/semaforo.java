/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode;
import java.util.ArrayList;

/**
 *
 * @author aaron
 */
public class semaforo {
    //this is going to be the vertex of our matrix
    private ArrayList<String[]> turnos;
    private final int id;
    private int gradoEntrada;

    public semaforo(int id) {
        this.id = id;
        this.turnos = new ArrayList<>();
    }

    public ArrayList<String[]> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<String[]> turnos) {
        this.turnos = turnos;
    }

    public int getId() {
        return id;
    }


    public int getGradoEntrada() {
        return gradoEntrada;
    }
    
    public void setGradoEntrada(ArrayList <Calle> calles) {
        int nodoAux, resultado = 0;
        for (Calle c : calles) {
            nodoAux = c.getNodoFinal();
            if (nodoAux == this.id){
                resultado++;
            }
        }
        this.gradoEntrada = resultado;
    }

    @Override
    public String toString() {
        return "semaforo{" + "turnos=" + turnos + ", id=" + id + ", gradoEntrada=" + gradoEntrada + '}';
    }
    
    
    
}
