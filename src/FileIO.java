/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.opencsv.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author vabil
 */
public class FileIO {

    public void readFile(String fileName) throws FileNotFoundException {
        CSVReader reader = new CSVReader(new FileReader(fileName));

    }
    
    public void writeFile(String fileName){
        
    }
}
