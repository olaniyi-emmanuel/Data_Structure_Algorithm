package data_structure;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add( new Ball("Blue"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("green"));
        balls.add(new Ball("Black"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    record Ball(String colour) {}
}
