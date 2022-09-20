package animal;
// 3 core things
// an id in memory - location on the heap
//state - attributes
// behavior methods

/*
public = class, package, subclass, YES
protected = class, package, subclass, NO
 */
public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal ("animal name");
        //animal.makeNoise();

        Dog dog = new Dog ("doggy", "corgi");
        dog.makeNoise(dog);

        Cat cat = new Cat ("garfield", true);
        cat.makeNoise(cat);

        Monkey monkey = new Monkey("george");
        monkey.makeNoise(monkey);
//        Animal animal = new Dog("bingo");
//        animal.makeNoise();
//
//        animal = new Cat("GARFIELD");
//        animal.makeNoise();
//        System.out.println(animal instanceof Cat); //this is to test which animal it is.
//        ((Cat)animal).printCatName(); //casting

        //Animal objectAnimal = new Animal("sasha");
        //objectAnimal.setHeight(9);
        //System.out.println(objectAnimal.getHeight());
        //System.out.println(objectAnimal);
        //objectAnimal.printAnimalName();

        //Animal objectAnimal2 = new Animal("mike");
        //objectAnimal2.setSound("ruffs");
        //System.out.println(objectAnimal2.getSound());
        //System.out.println(objectAnimal2);
        //objectAnimal2.printAnimalName();
    }
}
