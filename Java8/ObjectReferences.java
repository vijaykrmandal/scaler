package Java8;

public class ObjectReferences {
    class Person {
        String firstName;
        String lastName;
    
        Person() {}
    
        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }
    public void display(){
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person.firstName);
        System.out.println(person.lastName);

    }
    public static void main(String[] args) {
        ObjectReferences obj=new ObjectReferences();
        obj.display();
    }
}
