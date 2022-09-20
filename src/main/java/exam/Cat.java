package exam;

public class Cat extends Feline implements IPet{
    public Cat(String name, boolean isItLazy) {
        super(name, isItLazy);
    }

    @Override
    public void printName() {
        System.out.println("This Cat is call" + this.getName());

    }

    @Override
    public void beFriendly() {
        System.out.println("moews");
    }

    @Override
    public void Play() {
        System.out.println("chases ball");

    }
}
