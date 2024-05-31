package interface_1.animals;

public class Controller {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sound();
        dog.sound();

        Animal animal = new Dog();
        animal.sound();

    }
}
