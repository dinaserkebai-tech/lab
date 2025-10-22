//5 exp


class Sports {

    public void play() {
        System.out.println("Playing a sport...");
    }
}

class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Football: Kick the ball and score goals!");
    }
}
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribble, shoot, and score!");
    }
}
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Rugby: Tackle hard and run with the ball!");
    }
}
public class SportsTest {
    public static void main(String[] args) {
        Sports sport1 = new Football();
        Sports sport2 = new Basketball();
        Sports sport3 = new Rugby();

        sport1.play();
        sport2.play();
        sport3.play();
    }
}