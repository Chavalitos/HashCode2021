/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlehashcode;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Input {
        public static Scanner readFile(String fileName) {
        try {
          File myFile = new File(fileName);
          Scanner myReader = new Scanner(myFile);
          return myReader;
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
        }
            return null;
    }
}
