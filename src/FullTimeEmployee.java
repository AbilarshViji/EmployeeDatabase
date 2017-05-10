
public class FullTimeEmployee extends EmployeeInfo {

    private double annualSalary;

    public FullTimeEmployee(int eN, String fN, String lN, String wL, double dR, double aSal) {
        super(eN, fN, lN, wL, dR);
        annualSalary = aSal;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getNetSalary(double dR) {
        return annualSalary * dR;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
