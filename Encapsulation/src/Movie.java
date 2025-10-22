//13 exp


public class Movie {
    private String title;
    private String director;
    private double duration;
    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public String getMovieDetails() {
        return "🎬 Movie Details:\n" +
                "Title: " + title + "\n" +
                "Director: " + director + "\n" +
                "Duration: " + duration + " hours";
    }
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan", 2.5);

        System.out.println(movie.getMovieDetails());

        movie.setTitle("Interstellar");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(2.9);

        System.out.println("\nUpdated Movie Info:");
        System.out.println(movie.getMovieDetails());
    }
}