
package googlehashcode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author user
 */
public class Output {
    
    public static void clear(String filename){
        try{
            File output = new File(filename);
            
            if(output.createNewFile()){
                System.out.print("Creando archivo...\n");
            }
            
            FileOutputStream fos = new FileOutputStream(output, false);
            OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);
            
            writer.append("");
            
            writer.close();
            osw.close();
            fos.close();
            
        }catch(IOException error){
            error.printStackTrace();
        }        
    }
    
    public static void out(String filename, String msj){
        try{
            File output = new File(filename);
            
            if(output.createNewFile()){
                System.out.print("Creando archivo...\n");
            }
            
            FileOutputStream fos = new FileOutputStream(output, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);
            
            writer.append(msj).append("\n\n");
            
            writer.close();
            osw.close();
            fos.close();
            
        }catch(IOException error){
            error.printStackTrace();
        }
    }
    
}
