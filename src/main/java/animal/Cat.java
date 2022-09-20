package animal;

public class Cat extends Animal {
    public boolean hasTail;

    public Cat(String name, boolean hasTail) {
        super(name);
        this.hasTail = hasTail;
    }
        public void printCatName(){
        System.out.println("cat name is " + this.getName());
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("moew moew");
    }
}


