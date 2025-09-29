public class Date {
    // Поля
    private int day;
    private int month;
    private int year;

    // Конструктор
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Геттеры
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Сеттеры
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод setDate()
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Метод toString()
    @Override
    public String toString() {
        // Форматирование в виде dd/MM/yyyy
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
