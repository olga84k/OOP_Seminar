public class SalaryServise {
    private int baseSalary;
    public  SalaryServise(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
}
