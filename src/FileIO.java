
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author vabil
 */
public class FileIO {

    MyHashTable hashTable = new MyHashTable(2);

    //read the csv to hashtable
    public void readFile(String fileName, MyHashTable hashTable) throws FileNotFoundException, IOException {
        //init components for reading file
        BufferedReader br = null;
        FileReader fr = null;
        StringBuilder sb = new StringBuilder();
        String data;
        ArrayList dataArray = new ArrayList();
        int i = 0;
        //load data into array
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while ((data = br.readLine()) != "") {
                if (data == null) {
                    break;
                }
                dataArray.add(data);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //manipulate strings into hashtable
        for (int x = 0; x < i; x++) {
            sb.setLength(0);
            sb.append(dataArray.get(x).toString());
            String tempOld = new String(sb);
            String[] temp = tempOld.split(",");
            if ("F".equals(temp[0])) {
                FullTimeEmployee read = new FullTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Double.parseDouble(temp[5]), Double.parseDouble(temp[6]));
                hashTable.addEmployee(read);
            } else {
                PartTimeEmployee read = new PartTimeEmployee(Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], Double.parseDouble(temp[5]), Double.parseDouble(temp[6]), Double.parseDouble(temp[7]), Double.parseDouble(temp[8]));
                hashTable.addEmployee(read);
            }
        }
    }

    //write file to csv
    public void writeFile(String fileName, MyHashTable hashTable) throws FileNotFoundException {
        try {
            PrintWriter writer = new PrintWriter(new File(fileName));
            StringBuilder sb = new StringBuilder();
            //cycle through the hashtable
            for (ArrayList<EmployeeInfo> bucket : hashTable.buckets) {
                for (int x = 0; x < bucket.size(); x++) {
                    //build and write a string to the file
                    if (bucket.get(x) instanceof FullTimeEmployee) {
                        sb.setLength(0);
                        sb.append("F");
                        sb.append(",");
                        sb.append(bucket.get(x).getEmployeeNum());
                        sb.append(",");
                        sb.append(bucket.get(x).getFirstName());
                        sb.append(",");
                        sb.append(bucket.get(x).getLastName());
                        sb.append(",");
                        sb.append(bucket.get(x).getWorkLocation());
                        sb.append(",");
                        sb.append(bucket.get(x).getDeductionRate());
                        sb.append(",");
                        sb.append(((FullTimeEmployee) bucket.get(x)).getAnnualSalary());
                        writer.write(sb.toString() + "\n");
                    } else {
                        sb.setLength(0);
                        sb.append("P");
                        sb.append(",");
                        sb.append(bucket.get(x).getEmployeeNum());
                        sb.append(",");
                        sb.append(bucket.get(x).getFirstName());
                        sb.append(",");
                        sb.append(bucket.get(x).getLastName());
                        sb.append(",");
                        sb.append(bucket.get(x).getWorkLocation());
                        sb.append(",");
                        sb.append(((PartTimeEmployee) bucket.get(x)).getDeductionRate());
                        sb.append(",");
                        sb.append(((PartTimeEmployee) bucket.get(x)).getHourlyWage());
                        sb.append(",");
                        sb.append(((PartTimeEmployee) bucket.get(x)).getHoursPerWeek());
                        sb.append(",");
                        sb.append(((PartTimeEmployee) bucket.get(x)).getWeeksPerYear());
                        writer.write(sb.toString() + "\n");
                    }
                }
                writer.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
