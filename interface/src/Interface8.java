// Interface8.java
interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football on the field.");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball on the court.");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball in the gym.");
    }
}

public class Interface8 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
