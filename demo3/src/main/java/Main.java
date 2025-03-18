/**
 * @author Nruonan
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person("废物");
        Shirts shirts = new Shirts();
        Trouser trouser = new Trouser();
        shirts.decorate(person);
        trouser.decorate(shirts);
        trouser.show();

    }
}
