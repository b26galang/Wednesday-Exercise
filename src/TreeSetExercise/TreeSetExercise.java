import java.util.Set;
import java.util.TreeSet;

// Create and populate Tree Set, print out the numbers less than 7
public class TreeSetExercise {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("- Tree Set");
        System.out.println(numbers);




    }
}
