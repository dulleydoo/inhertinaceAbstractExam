package payroll;

public class SalariedEmployee extends Employee implements Ipay{

    private double basePay;

    public SalariedEmployee(String name) {
        super(name);
    }
    public void printPayCheck(){
        System.out.println(basePay);
    }

    @Override
    public void printPay() {
        System.out.println("Print pay for salaried for employee");
    }
}
