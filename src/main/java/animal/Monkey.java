package animal;

public class Monkey extends Animal {


    public Monkey(String name) {
        super(name);
    }
    @Override
    public void makeNoise(Animal animal){
        System.out.println("monkey noise");
        //super.makeNoise();
    }
}
