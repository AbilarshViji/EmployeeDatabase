
public class PartTimeEmployee extends EmployeeInfo {

    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    //constructor for part time employees
    public PartTimeEmployee(int eN, String fN, String lN, String wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
    }

    public double getNetSalary(double dR) { //calculate and get net salary
        return getAnnualSalary(hourlyWage, hoursPerWeek, weeksPerYear) * (1 - (dR / 100));
    }

    public double getAnnualSalary(double hW, double hPW, double wPY) { //calculate and get annual salary
        return hW * hPW * wPY;
    }

    public double getHourlyWage() { //get hourly wage
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) { //set hourly wage
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() { //get hours per week
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) { //set hours per week 
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getWeeksPerYear() { //get weeks per year
        return weeksPerYear;
    }

    public void setWeeksPerYear(double weeksPerYear) { //set weeks per year 
        this.weeksPerYear = weeksPerYear;
    }
}
