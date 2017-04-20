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

/**
 *
 * @author vabil
 */
public class FileIO {

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
            csvReader.close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void writeFile(String fileName) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(fileName), '\t');
        for (int i = 0; i < buckets.length; i++) {
            for (int x = 0; x < buckets[i].size(); x++) {
                if (buckets[i].get(x).getHourlyWage() == null) {
                    String[] temp = new String[]{"F", buckets[i].get(x).getEmployeeNum(), buckets[i].get(x).getFirstName(), buckets[i].get(x).getLastName(), buckets[i].get(x).getWorkLocation(), buckets[i].get(x).getDeductionRate(), buckets[i].get(x).getAnnualSalary()};
                    writer.writeNext(temp);
                } else {
                    String[] temp = new String[]{"P", buckets[i].get(x).getEmployeeNum(), buckets[i].get(x).getFirstName(), buckets[i].get(x).getLastName(), buckets[i].get(x).getWorkLocation(), buckets[i].get(x).getDeductionRate(), buckets[i].get(x).getHourlyWage(), buckets[i].get(x).getHoursPerWeek(), buckets[i].get(x).getWeeksPerYear()};
                    writer.writeNext(temp);
                }

            }

        }
        writer.close();
    }

}
