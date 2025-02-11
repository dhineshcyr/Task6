package task7;
import java.util.Map;
import java.util.TreeMap;
public class Question6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(103, "Alice");
        employees.put(101, "Bob");
        employees.put(102, "Charlie");

        System.out.println("Employee names in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
//output
//Employee names in alphabetical order:
//Bob
//Charlie
//Alice
