package exam;

public class Dog extends Canine implements IPet{
    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public void printName() {

    }

    @Override
    public void beFriendly() {
        System.out.println("ruff ruff");
    }

    @Override
    public void Play() {
        System.out.println("catches ball");

    }
}
