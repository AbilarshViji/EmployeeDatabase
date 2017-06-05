
public class FullTimeEmployee extends EmployeeInfo {

    private double annualSalary;

    //constructor for full time employees
    public FullTimeEmployee(int eN, String fN, String lN, String wL, double dR, double aSal) {
        super(eN, fN, lN, wL, dR);
        annualSalary = aSal;
    }

    public double getAnnualSalary() { //get annual salary
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) { //set annual salary
        this.annualSalary = annualSalary;
    }

    public double getNetSalary(double dR) { //get and calculate net salary
        return annualSalary * (1 - (dR / 100));
    }
}
