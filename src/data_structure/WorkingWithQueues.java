package data_structure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alonso", 43));
        linkedList.add(new Person("Veronica", 43));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
        Queue<Person> superMartket = new LinkedList<>();
        superMartket.add(new Person("Alex", 21));
        superMartket.add(new Person("Bola", 26));
        superMartket.add(new Person("Dupe", 28));

        System.out.println(superMartket);
        System.out.println(superMartket.peek());


    }

    static record Person (String name, int age) {}
}
