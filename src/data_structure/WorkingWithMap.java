package data_structure;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<Integer, WorkingWithQueues.Person> map = new HashMap<>();
        map.put(1, new WorkingWithQueues.Person("Alex", 34));
        map.put(2, new WorkingWithQueues.Person("Bola", 34));
        map.put(3, new WorkingWithQueues.Person("Veronica", 46));
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        map.entrySet().forEach(System.out::println);
        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });
    }
}
