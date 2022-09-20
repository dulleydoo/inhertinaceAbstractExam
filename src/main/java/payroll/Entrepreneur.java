package payroll;

public class Entrepreneur extends Person implements Ipay{

    private double gross, investment;

    public Entrepreneur(String name) {
        super(name);
    }

    @Override
    public void printPayCheck() {
        System.out.println(gross - investment);
    }

    @Override
    public void printPay() {
        System.out.println("Now pay entrepreneur");
    }
}
