
public class EmployeeInfo {

    protected int employeeNum;
    protected String firstName;
    protected String lastName;
    protected String workLocation;
    protected double deductionRate;

    //constructor got employee info
    public EmployeeInfo(int eN, String fN, String lN, String wL, double dR) {
        employeeNum = eN;
        firstName = fN;
        lastName = lN;
        workLocation = wL;
        deductionRate = dR;
    }

    public int getEmployeeNum() { //get employee number
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNumber) { //set employee number
        this.employeeNum = employeeNumber;
    }

    public String getFirstName() { //get first name
        return firstName;
    }

    public void setFirstName(String firstName) { //set first name
        this.firstName = firstName;
    }

    public String getLastName() { //get last name
        return lastName;
    }

    public void setLastName(String lastName) { //set last name
        this.lastName = lastName;
    }

    public String getWorkLocation() { //get work location 
        return workLocation;
    }

    public void setWorkLocation(String workLocation) { //set work location 
        this.workLocation = workLocation;
    }

    public double getDeductionRate() { //get deductions rate 
        return deductionRate;
    }

    public void setDeductionRate(double deductionRate) { //set deductions rate 
        this.deductionRate = deductionRate;
    }
}
