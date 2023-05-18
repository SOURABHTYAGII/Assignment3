import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArray {

        public static void main(String[] args) {
            // Create an ArrayList with duplicate elements
            List<Integer> numbers  = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.add(4);
            numbers.add(1);

            // Print the ArrayList before removing duplicates
            System.out.println("ArrayList with duplicates: " + numbers);

            // Remove duplicates
            List<Integer> uniqueNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (uniqueNumbers.contains(number)) {
                    continue;
                }
                uniqueNumbers.add(number);
            }

            // Update the original ArrayList
            numbers.clear();
            numbers.addAll(uniqueNumbers);

            // Print the ArrayList after removing duplicates
            System.out.println("ArrayList without duplicates: " + numbers);
        }
    }


