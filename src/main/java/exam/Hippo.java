package exam;

public class Hippo extends Animal{

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("This hippos name is" + getName());

    }
}
