/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.opencsv.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vabil
 */
public class FileIO {
//try catch

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        try (CSVReader csvReader = new CSVReader(new FileReader(fileName), ',', '"', 2)) {
            String[] temp = null;
            while ((temp = csvReader.readNext()) != null) {
                if ("F".equals(temp[0])) {
                    FullTimeEmployee read = new FullTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], Integer.parseInt(temp[4]), Double.parseDouble(temp[5]), Double.parseDouble(temp[6]));
                    hashTable.add(read);
                } else {
                    PartTimeEmployee read = new PartTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], Integer.parseInt(temp[4]), Double.parseDouble(temp[5]), Double.parseDouble(temp[6]), Double.parseDouble(temp[7]), Double.parseDouble(temp[8]));
                    hashTable.add(read);
                }
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }

    }

    public void writeFile(String fileName) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(fileName), '\t');
        //see display contemts
        //TODO need some function that returns all contents so can write in string
        for (int i = 0; i < buckets.length; i++) {
            for (int x = 0; x < buckets[i].size(); x++) {
                String[] temp = new String[]{"F",buckets[i].get(x).getEmployeeNum(),buckets[i].get(x).getFirstName(),buckets[i].get(x).getLastName(),buckets[i].get(x).getFirstName(),buckets[i].get(x).getFirstName(),buckets[i].get(x).getFirstName()};
                writer.writeNext(temp);

            }
        }
        writer.close();
    }
}
