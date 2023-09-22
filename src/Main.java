import data_structure.DynamicArray;
import data_structure.Kata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kata.solution("Bonus");

        DynamicArray dynamicArray = new DynamicArray(10);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        System.out.println(dynamicArray.search("B"));

        dynamicArray.insert(0, "Y");
        dynamicArray.delete("B");
        System.out.println(dynamicArray);

        dynamicArray.insert(3 , "D");
        dynamicArray.insert(4, "E");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.capacity);
        System.out.println(dynamicArray.size);

    }
}