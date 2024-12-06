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

/**
 * класс Book со свойствами name, author и releaseYear
 * @author kolya
 * @version 2.1
 */
class Book{
    /**Поле имя*/
    String name;
    /**Поле автор*/
    String author;
    /**Поле год выпуска*/
    int releaseYear;
    /**
     * Конструктор - создание объекта с определенными параметрами
     * @param name имя
     * @param author автор
     * @param releaseYear год выпуска
     */
    Book(String name, String author, int releaseYear){
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }
}

/**
 * класс Person со свойствами name, surname и birthYear
 * @author kolya
 * @version 2.1
 */
class Person{
    /**Поле имя*/
    String name;
    /**Поле фамилия*/
    String surname;
    /**Поле год рождения*/
    int birthYear;
    /**
     * Конструктор - создание объекта с определенными параметрами
     * @param name имя
     * @param surname фамилия
     * @param birthYear год рождения
     */
    Person(String name, String surname, int birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    /**
     * Функция получения информации о названии книги и марке автомобиля
     * @param book
     * @param car
     */
    public void aboutBookAndCar(Book book, Car car){
        System.out.printf("%s читает книгу '%s' в своей машине %s", name, book.name, car.mark);
    }
}

/**
 * класс Car со свойствами name, engineCapacity и releaseYear
 * @author kolya
 * @version 2.1
 */
class Car {
    /**Поле марка*/
    String mark;
    /**Поле год выпуска*/
    int releaseYear;
    /**Поле объем двигателя*/
    double engineCapacity;

    /**
     * Конструктор - создание объекта с определенными параметрами
     * @param mark марка
     * @param engineCapacity объем двигателя
     * @param releaseYear год выпуска
     */
    Car(String mark, int releaseYear, double engineCapacity) {
        this.mark = mark;
        this.releaseYear = releaseYear;
        this.engineCapacity = engineCapacity;
    }
}