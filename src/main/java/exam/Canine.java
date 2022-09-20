package exam;

public abstract class Canine extends Animal{
    private String type;
    public Canine(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public abstract void printName();


}
