package data_structure;

import java.sql.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "blue";
        colours [1]= "red";
        colours [2]= "green";
        colours[3] = "black";
        colours[4] = "white";

        System.out.println(colours[1]);
        System.out.println(Arrays.toString(colours));

        int[] numbers = {100, 200};
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (String count: colours) {
            System.out.println(count);
        }

        Arrays.stream(colours).forEach(System.out::println);
    }
}






