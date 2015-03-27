package nyc.c4q.yuliyakaleda;

/**
 * Created by July on 3/24/15.
 */
public class checkCity {


    public static void main(String[] args) {
        // create two objects
        Person p1 = new Person("Yuliya");
        Person p2 = new Person("Alex");

        p1.setCity("Seattle");
        p2.setCity("New York");

        if (checkSameCity(p1, p2)) {
            System.out.println(p1.getName() + " and " + p2.getName() + " live in the same city.");
        } else {
            System.out.println(p1.getName() + " and " + p2.getName() + " live in different cities.");
        }
    }

    public static boolean checkSameCity(Person p1, Person p2) {

        return (p1.getCity().equals(p2.getCity()));
        }

    public static Person registerChild (Person p1) {
        //create a child object
        Person p3 = new Person();
        p3.setName("Abc");
        p3.setCity(p1.getCity());
        p3.setPhoneNumber(p1.getPhoneNumber());
        return p3;
    }
}

