public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salary = 0.0;
        salary = (daysSkipped >= 5) ? 0.85 : 1.0 ;
        return salary;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10 ;
    }

    public double bonusForProductsSold(int productsSold) {
         int bonus = bonusMultiplier (productsSold);
         return bonus * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = 0.0;
        finalSalary = (1000.00 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return (finalSalary >=2000 ) ? 2000 : finalSalary;
    } 
}
