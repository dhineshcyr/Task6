package task7;
import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList before removing elements: " + list);

        list.clear(); // Removes all elements

        System.out.println("ArrayList after removing elements: " + list);
    }
}

//output
//ArrayList before removing elements: [Apple, Banana, Cherry]
//ArrayList after removing elements: []
