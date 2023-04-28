import java.util.LinkedList;
import java.util.Queue;

public class QueueEgWClass {
    public static void main(String[] args) {
        Queue<Person> my_queue = new LinkedList<>();

        my_queue.add(new Person("Ronaldo",37));
        my_queue.add(new Person("Mynt",20));
        my_queue.add(new Person("Mayweather",40));
        my_queue.add(new Person("Rashy",25));

//        Iterator<Person> listIterator = my_queue.iterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

        Person person_one = my_queue.peek();
        System.out.println(person_one.name);
    }

    static record Person(String name, int age){

    }
}

