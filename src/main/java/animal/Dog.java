package animal;
// subclass , child class
//A dog is - a animal - is-a relationship
public class Dog extends Animal{
    public String breed;
    public Dog(String name,String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void makeNoise(Animal animal){
        System.out.println("ruff ruff");
    }






//    public void assignAndPrintAnimalSex(){
//        this.sex = 'M';
//        System.out.println("Dog's sex is" + this.sex);
//    }
//    public void printAnimalName(){
//        System.out.println("dog name is " + this.getName());
//    }

}
