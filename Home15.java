// Enum для днів тижня
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Інтерфейс з методом advise
interface Adviser {
    void advise(Day day);
}

// Клас, який реалізує інтерфейс Adviser
class WeeklyAdviser implements Adviser {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> {
                System.out.println("Рекомендація: Будьте продуктивними на роботі! Плануйте завдання і дотримуйтеся розкладу.");
            }
            case FRIDAY -> {
                System.out.println("Happy Friday! Залишилось зовсім трохи до вихідних!");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("Вихідні! Рекомендуємо відвідати парк, музей або сходити в кіно.");
            }
            default -> {
                System.out.println("Невідомий день.");
            }
        }
    }
}

// Основний клас для тестування
public class Main {
    public static void main(String[] args) {
        Adviser adviser = new WeeklyAdviser();
        
        // Перевірка різних днів
        adviser.advise(Day.MONDAY);
        adviser.advise(Day.FRIDAY);
        adviser.advise(Day.SATURDAY);
    }
}
