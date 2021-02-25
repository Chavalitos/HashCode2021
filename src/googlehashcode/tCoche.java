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
public class tCoche {
    private int nCalles;
    private ArrayList<String> trayectoria;

    public tCoche(int nCalles) {
        this.nCalles = nCalles;
    }

    public int getnCalles() {
        return nCalles;
    }

    public void setnCalles(int nCalles) {
        this.nCalles = nCalles;
    }

    public ArrayList<String> getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(ArrayList<String> trayectoria) {
        this.trayectoria = trayectoria;
    }

    @Override
    public String toString() {
        return "tCoche{" + "nCalles=" + nCalles + ", trayectoria=" + trayectoria + '}';
    }
    
    
}
