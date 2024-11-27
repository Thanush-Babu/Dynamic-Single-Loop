import  java.util.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of Lists in the input screen:");
        // int num = sc.nextInt();
        String listName = "" ;
        String listvalues = "";
        int i = 0;
        List<String> listNames = new ArrayList<>();
        List<List<Object>> lists = new ArrayList<>();
        System.out.println("(type 'exit' to quit)");
        while (!listName.equals("exit")) {
            // System.out.println("Enter List " + (i+1) + " name : ");
            listName = sc.nextLine();
            if (listName.equals("exit")) {
                break; 
            }
            listNames.add(listName);
            lists.add(new ArrayList<>());
            System.out.println("Enter values of " + listName + ": ");
            while (!listvalues.equals("exit")) {  
                listvalues = sc.nextLine(); 
                if (!listvalues.equals("exit")) {
                    try {
                        // Try to convert to an integer
                        lists.get(i).add(Integer.parseInt(listvalues));
                    } catch (NumberFormatException e1) {
                        try {
                            // Try to convert to a float
                            lists.get(i).add(Double.parseDouble(listvalues));
                        } catch (NumberFormatException e2) {
                            // If both fail, return as a string
                            lists.get(i).add(listvalues);
                        }
                    }
                }
            }
            listvalues = "";
            i++;
        }
        System.out.println("\n");
        System.out.println(listNames);
        System.out.println("\n");
        System.out.println(lists);
        // System.out.println("\n");

        //List <Integer> quantity = new ArrayList<>();
        // List <Integer> quantity = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // List <String> fruits = Arrays.asList("apple", "banana", "cherry");
        // List <Double> decimals = Arrays.asList(1.99,2.99,3.99);

        // List<List<?>> lists = new ArrayList<>();
        // lists.add(quantity);
        // lists.add(fruits);
        // lists.add(decimals);

        // List<List<Object>> allCombinations = combinations(lists);

        // for (List<Object> list : allCombinations) {
        //     System.out.println("[Quantity:"+ list.get(0) + ", Fruits:" + list.get(1) + ", Prices:" + list.get(2) +"]");
        // }
        sc.close();
    }
    private static List<List<Object>> combinations(List<List<?>> lists) {
        List<List<Object>> result = new ArrayList<>();
        combinationsHelper(lists, 0, new ArrayList<>(), result);
        return result;
    }
    public  static void combinationsHelper(List<List<?>> lists, int depth, List<Object> currentCombination, List<List<Object>> result) {
        if (depth == lists.size()) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (Object element : lists.get(depth)) {
            currentCombination.add(element);
            combinationsHelper(lists, depth + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}