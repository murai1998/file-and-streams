package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("brown");
        list.add("black");
        String[] arr = new String[list.size()];
        list.toArray(arr);


        int[] arr2 = {1, 2};
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i : arr2) {
            list2.add(i);
        }
        System.out.println(list2);

    }
}
