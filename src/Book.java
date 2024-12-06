/**
 * класс Book со свойствами name, author и releaseYear
 * @author kolya
 * @version 2.1
 */
public class Book{
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
