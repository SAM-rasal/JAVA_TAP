import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> nameList = new ArrayList<>();

        // Add elements
        nameList.add("Samruddhi");
        nameList.add("Siddharth");
        nameList.add("Sai");
        nameList.add("Chaitrali");
        nameList.add("Arnav");

        // Create an ArrayList of Integers (ages)
        ArrayList<Integer> ageList = new ArrayList<>();

        ageList.add(21);
        ageList.add(20);
        ageList.add(19);
        ageList.add(18);
        ageList.add(21);

        // Print elements
        System.out.println("Names:");
        for (String s : nameList) {
            System.out.println(s);
        }

        System.out.println("\nAges:");
        for (int i : ageList) {
            System.out.println(i);
        }
    }
}
