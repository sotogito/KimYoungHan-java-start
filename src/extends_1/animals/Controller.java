package extends_1.animals;

public class Controller {

    public static void main(String[] args) {
        PetFeeder petFeeder = new PetFeeder();

        petFeeder.feedPet(new Cat());
        petFeeder.feedPet(new Dog());

        Animal animal = new Cat();
        animal.eat();
        Animal animal2 = new Dog();
        animal2.eat();
        animal.sleep();
    }
}
