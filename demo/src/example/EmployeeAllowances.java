import java.util.Arrays;
public class EmployeeAllowances {
    public static void main(String[] args) {
      double salary = 50000.0; // Sample salary
        double da = salary * 0.12; // DA (12% of salary)
        double hra = salary * 0.13; // HRA (13% of salary)
        double pf = salary * 0.15; // PF (15% of salary)
        double gross = salary + da + hra; // Gross salary
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);
    }}
