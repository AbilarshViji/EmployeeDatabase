/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author vabil
 */
public class FileIO {

    MyHashTable hashTable = new MyHashTable(2);

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        FileReader fr = null;
        String data;
        String[] dataArray = null; //TODO need better var names
        int i = 0;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while ((data = br.readLine()) != null) {
                dataArray[i] = data;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int x = 0; x > i; x++) {
            String[] temp = dataArray[i].split(",");
            if ("F" == (temp[0])) {
                FullTimeEmployee read = new FullTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Double.parseDouble(temp[5]), Double.parseDouble(temp[6]));
                hashTable.addEmployee(read);
            } else {
                PartTimeEmployee read = new PartTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Double.parseDouble(temp[5]), Double.parseDouble(temp[6]), Double.parseDouble(temp[7]), Double.parseDouble(temp[8]));
                hashTable.addEmployee(read);
            }
        }
    }

    public void writeFile(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(fileName));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashTable.buckets.length; i++) {
            for (int x = 0; x < hashTable.buckets[i].size(); x++) {
                if (hashTable.buckets[i].get(x) instanceof FullTimeEmployee) {
                    sb.setLength(0);
                    sb.append("F");
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getEmployeeNum());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getFirstName());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getLastName());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getWorkLocation());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getDeductionRate());
                    sb.append(",");
                    sb.append(((FullTimeEmployee) hashTable.buckets[i].get(x)).getAnnualSalary());
                    writer.write(sb.toString());
                } else {
                    sb.append("P");
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getEmployeeNum());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getFirstName());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getLastName());
                    sb.append(",");
                    sb.append(hashTable.buckets[i].get(x).getWorkLocation());
                    sb.append(",");
                    sb.append(((PartTimeEmployee) hashTable.buckets[i].get(x)).getDeductionRate());
                    sb.append(",");
                    sb.append(((PartTimeEmployee) hashTable.buckets[i].get(x)).getHourlyWage());
                    sb.append(",");
                    sb.append(((PartTimeEmployee) hashTable.buckets[i].get(x)).getHoursPerWeek());
                    sb.append(",");
                    sb.append(((PartTimeEmployee) hashTable.buckets[i].get(x)).getWeeksPerYear());
                    writer.write(sb.toString());
                }

            }

        }

    }
}
