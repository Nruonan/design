/**
 * @author Nruonan
 * @description
 */
public class Finery extends Person{
    Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
