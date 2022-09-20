package products;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void printProductName() {
        System.out.println(this.getName());

    }
}
