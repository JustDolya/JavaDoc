/**
 * класс Car со свойствами name, engineCapacity и releaseYear
 * @author kolya
 * @version 2.1
 */
public class Car {
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
