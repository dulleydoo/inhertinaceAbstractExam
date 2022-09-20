package exam;

public class Lion extends Feline{
    public Lion(String name, boolean isItLazy) {
        super(name, isItLazy);
    }

    @Override
    public void printName() {
        System.out.println("this lion is called" + getName());

    }
}
