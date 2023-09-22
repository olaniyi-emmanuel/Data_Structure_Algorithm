package data_structure;

import java.util.Scanner;

public class Kata {

    public static String solution(String str) {
        // Your code here...
        //Scanner scanner = new Scanner(System.in);
       //System.out.println("Input the text of your choice: ");
       //tr = scanner.nextLine();
        String str1= "";
        for(int i = str.length() -1; i>=0; i--) {
            str1 += str.charAt(i);

        }
        System.out.println(str1);
        return str1;

    }

}
