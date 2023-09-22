package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> immutableNames = List.of(
                "Ola",
                "Olu",
                "Bola"
        );


        List<String> colours = new ArrayList<String>();
        colours.add("blue");
        colours.add("purple");
        colours.add("Red");
        System.out.println(colours.size());
        System.out.println(colours.contains("blue"));

        System.out.println(colours);

        for (String color: colours) {
            System.out.print(color + " ");
        }

    }
}



