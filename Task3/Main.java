/*
 * Подумать как описать логику взаимодействия человека и домашнего питомца. 
 * Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
 * Какое ещё взаимодействие может быть?
 */
package Task3;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person("Андрей");
        Dog dog = new Dog("Жучка");
        Cat cat = new Cat("Муська");

        dog.response(owner.call("Ко мне!"));
        cat.response(owner.call("кис-кис!"));

        
    }
}
