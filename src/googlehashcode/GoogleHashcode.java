package googlehashcode;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author aaron
 */
public class GoogleHashcode {

    /**
     * @param args the command line arguments
     * args 0 -> filename
     */
    public static void main(String[] args) {
        //file
        String filename = args[0];
        String output = "Out_"+filename;

        
        Scanner datos = Input.readFile(filename);
        Output.clear(output);
        
        
        //ahora procedemos a trabajar con los datos
        while(datos.hasNext()){
            String linea1 = datos.nextLine();
            String []partes = linea1.split(" ");

            int duracion = Integer.parseInt(partes[0]);
            int nInterseccions = Integer.parseInt(partes[1]);
            int nCalles = Integer.parseInt(partes[2]);
            int nCoches = Integer.parseInt(partes[3]);
            int puntos = Integer.parseInt(partes[4]);
            ArrayList<Calle> listaCalles = new ArrayList<>();


            //we create all the streets
            for(int i = 0; i < nCalles; i++){
                String linea = datos.nextLine();
                String []partesCalle = linea.split(" ");
                Calle c = new Calle(Integer.parseInt(partesCalle[0]),Integer.parseInt(partesCalle[1]),partesCalle[2],Integer.parseInt(partesCalle[3]));
                listaCalles.add(c);
                System.out.println(c.toString());
                
            }

            //now we create the cars
            ArrayList<tCoche> listaCoches = new ArrayList<>();
            for(int i = 0; i < nCoches; i++){
                String linea = datos.nextLine();
                String []partesCoches = linea.split(" ");
                tCoche c = new tCoche(Integer.parseInt(partesCoches[0]));
                ArrayList<String> recorrido = new ArrayList<>();
                for(int j = 1; j <= c.getnCalles(); j++){
                    recorrido.add(partesCoches[j]);
                }
                c.setTrayectoria(recorrido);
                listaCoches.add(c);
                System.out.println(c.toString());
            }
            
            ArrayList<semaforo> listaSemaforos = new ArrayList<>();
            //create the nodes
            for(int i = 0; i < nInterseccions ; i++){
                semaforo s = new semaforo(i);
                listaSemaforos.add(s);
                s.setGradoEntrada(listaCalles);
                System.out.println(s.toString());
                
                for(tCoche c : listaCoches){
                    for(int j = 0; j < c.getnCalles(); j++){
                        for(Calle ca: listaCalles){
                            if(ca.getNombre().equals(c.getTrayectoria().get(j))){
                                //if(s.getId() == ca.getNodoFinal())
                            }
                        }
                    }
                }
                
            }
        
        }
        
        datos.close();
        
    }
    

    
}
