abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Glockenspiel extends Instrument {
    void play() { System.out.println("Playing Glockenspiel melody"); }
    void tune() { System.out.println("Tuning Glockenspiel"); }
}

class Violin extends Instrument {
    void play() { System.out.println("Playing Violin melody"); }
    void tune() { System.out.println("Tuning Violin"); }
}

public class Main9 {
    public static void main(String[] args) {
        Instrument g = new Glockenspiel();
        Instrument v = new Violin();
        g.play(); g.tune();
        v.play(); v.tune();
    }
}
