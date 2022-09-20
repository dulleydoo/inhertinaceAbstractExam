package products;

public class Horse extends Vehicle implements IRideable{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void printProductName() {
        System.out.println(this.getName());

    }

    @Override
    public void printRideExperience() {
        System.out.println("Riding a horse is fun");
    }
}
