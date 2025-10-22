//1 exp




class Animal {
    public void Sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Bird extends Animal {
    @Override
    public void Sound() {
        System.out.println("Bird says: Tweet tweet!");
    }
}
class Cat extends Animal {

    @Override
    public void Sound() {
        System.out.println("Cat says: Meow!");
    }
}

public class AnimalFamilyTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Bird myBird = new Bird();
        Cat myCat = new Cat();

        genericAnimal.Sound();
        myBird.Sound();
        myCat.Sound();
    }
}