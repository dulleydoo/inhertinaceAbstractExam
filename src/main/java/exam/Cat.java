package exam;

public class Cat extends Feline{
    public Cat(String name, boolean isItLazy) {
        super(name, isItLazy);
    }

    @Override
    public void printName() {
        System.out.println("This Cat is call" + this.getName());

    }
}
