/**
 * класс Person со свойствами name, surname и birthYear
 * @author kolya
 * @version 2.1
 */
public class Person{
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
