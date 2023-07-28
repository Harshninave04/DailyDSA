package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(4);
        System.out.println(list);

        System.out.println(list.get(1));

        list.add(1,45);
        System.out.println(list);
        list.remove( 2);
        System.out.println(list);

        ArrayList<String> name = new ArrayList<>();
        name.add("Harsh");
        name.add("Nandini");
        name.add("Dev");
        name.add("Sanjay");
        System.out.println(name);
        System.out.println(name.contains("Nandin"));
        // this adds the particular element on respective index
        name.add(1,"Reetik");
        System.out.println(name);
        // this deletes/remove the element of that particular index mentioned
        name.remove(1);
        System.out.println(name);



    }
}
