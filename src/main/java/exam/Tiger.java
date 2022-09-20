package exam;

public class Tiger extends Feline{
    public Tiger(String name, boolean isItLazy) {
        super(name, isItLazy);
    }

    @Override
    public void printName() {
        System.out.println("This tiger is called" + getName());

    }
}
