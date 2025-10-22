
interface Animal {
    void bark(); // Әдіс анықтамасы (аргументсіз, мән қайтармайды)
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}
