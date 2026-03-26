import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=====================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order
        List<String> trainConsist = new LinkedList<>();

        // Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial train consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}