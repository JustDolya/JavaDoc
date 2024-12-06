/**Основной класс программы*/
public class Main {
    /**
     * Основной метод программы, создающий объекты Car, Book и Person и выводящий метод объекта Person
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Car car = new Car("DaBaby car", 0, 69);
        Book book = new Book("Проблемы философии", "Рассел", 1900);
        Person person = new Person("Доля", "Канькин", 7002);
        person.aboutBookAndCar(book, car);
    }
}

