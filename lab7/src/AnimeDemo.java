













































interface AnimeActions {
    void fight();
    void useSpecialPower();
}
abstract class AnimeCharacter implements AnimeActions {
    private String name;
    private String anime;
    public AnimeCharacter(String name, String anime) {
        this.name = name;
        this.anime = anime;
    }
    public String getName() {
        return name;
    }
    public String getAnime() {
        return anime;
    }
    public void setAnime(String anime) {
        this.anime = anime;
    }
    public abstract void introduce();
}
class Naruto extends AnimeCharacter {
    public Naruto(String name, String anime) {
        super(name, anime);
    }
    @Override
    public void introduce() {
        System.out.println("I'm " + getName() + " from " + getAnime() + "! Believe it!");
    }
    @Override
    public void fight() {
        System.out.println(getName() + " is fighting using Taijutsu!");
    }
    @Override
    public void useSpecialPower() {
        System.out.println(getName() + " uses Rasengan!");
    }
}
class Luffy extends AnimeCharacter {
    public Luffy(String name, String anime) {
        super(name, anime);
    }
    @Override
    public void introduce() {
        System.out.println("I'm " + getName() + " from " + getAnime() + "! I'm gonna be the Pirate King!");
    }
    @Override
    public void fight() {
        System.out.println(getName() + " punches with his Gum-Gum powers!");
    }
    @Override
    public void useSpecialPower() {
        System.out.println(getName() + " uses Gear Fifth!");
    }
}
public class AnimeDemo {
    public static void main(String[] args) {
        AnimeCharacter naruto = new Naruto("Naruto Uzumaki", "Naruto");
        AnimeCharacter luffy = new Luffy("Monkey D. Luffy", "One Piece");
        naruto.introduce();
        naruto.fight();
        naruto.useSpecialPower();
        System.out.println();
        luffy.introduce();
        luffy.fight();
        luffy.useSpecialPower();
    }
}





// 1) AnimeActions интерфейсі – барлық кейіпкерлер орындауға тиіс әдістерді (fight() және useSpecialPower()) анықтайды.
// 2) AnimeCharacter – абстрактты класс, ол ортақ қасиеттерді (name, anime) қамтиды.
//    Бұл қасиеттер private болғандықтан, инкапсуляция жүзеге асады.
//    Мәліметтерге тек get және set әдістері арқылы қол жеткізуге болады.
// 3) Naruto және Luffy кластарында әдістер өз ерекшелігімен жазылған:
//    Наруто Rasengan қолданады, ал Луффи Gear Fifth.
// Нәтижесінде, бағдарлама аниме кейіпкерлерінің әрекеттерін көрсетеді




