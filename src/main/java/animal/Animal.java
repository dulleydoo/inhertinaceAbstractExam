package animal;
// it is a template for creating objects
//super class - base class, parent class
//overriding
public class Animal {
    private String name;

    protected char sex; //accessible to subclasses

//    private int height;
//
    private String noise;

    public Animal(String name) {
        this.name = name;
//        this.height = height;
//        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            animal.makeNoise(animal);
        }
        if (animal instanceof Cat) {
            animal.makeNoise(animal);

        }
        System.out.println("which animal noise");
    }














    //
//    public String getSound() {
//        return sound;
//    }
//
//    public void setSound(String sound) {
//        this.sound = sound;
//    }
//
//    //setter
//    public void setHeight(int height){
//        if(height > 9){
//            this.height = height;
//        }
//
//    }
//    //getter
//    public int getHeight(){
//        return this.height;
//    }
//
//
//
//
//
//    public void printAnimalName(){
//        System.out.println(this.name);
//    }







}
