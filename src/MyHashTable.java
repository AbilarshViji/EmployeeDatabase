
import java.util.*;

public class MyHashTable {


    public ArrayList<EmployeeInfo>[] buckets;

    public MyHashTable(int howManyBuckets) {
        buckets = new ArrayList[howManyBuckets];
        // of howManyBuckets ArrayLists.


        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList(); // Instantiate the ArrayList for
            // bucket i.
        }
    }

    public int calcBucket(int keyValue) {
        // Returns the bucket number as the integer keyValue modulo the number
        // of buckets for the hash table.
        return (keyValue % buckets.length);
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {
        int i = calcBucket(theEmployee.getEmployeeNum());
        return buckets[i].add(theEmployee);

    }

    public int searchEmployee(int employeeNum) {
        int num = calcBucket(employeeNum);
        if (buckets[num].isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < buckets[num].size(); i++) {
                if (buckets[num].get(i).getEmployeeNum() == employeeNum) {
                    return i;
                }
            }
        }
        return 0; //never will be reached
    }

    public EmployeeInfo removeEmployee(int employeeNum) {
        int num = searchEmployee(employeeNum);
        if (num != -1) {
            EmployeeInfo removed = buckets[calcBucket(employeeNum)].get(num);
            buckets[calcBucket(employeeNum)].remove(num);
            return removed;
        } else {
            return null;
        }
    }

    public void displayContents() {
        for (int i = 0; i < buckets.length; i++) {
            for (int x = 0; x < buckets[i].size(); x++) {
                System.out.println(buckets[i].get(x).getFirstName());
            }
        }

    }
}
