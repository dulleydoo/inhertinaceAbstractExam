package payroll;

public class Vendor implements Ipay {


    @Override
    public void printPay() {
        System.out.println("vendor gettin paid");
    }
}
