
public class EmployeeInfo {

    protected int employeeNum;
    protected String firstName;
    protected String lastName;
    protected String workLocation;
    protected double deductionRate;

    public EmployeeInfo(int eN, String fN, String lN, String wL, double dR) {
        employeeNum = eN;
        firstName = fN;
        lastName = lN;
        workLocation = wL;
        deductionRate = dR;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNumber) {
        this.employeeNum = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getDeductionRate() {
        return deductionRate;
    }

    public void setDeductionRate(double deductionRate) {
        this.deductionRate = deductionRate;
    }
}
