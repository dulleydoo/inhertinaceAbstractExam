package exam;

public abstract class Feline extends Animal{
    private boolean isItLazy;
    public Feline(String name, boolean isItLazy) {
        super(name);
        this.isItLazy = isItLazy;
    }

    @Override
    public abstract void printName();


}
