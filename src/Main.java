import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Rami");
        list.add("Sami");
        list.add("Houda");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2,"Shadi");
        System.out.println(list);
        list.add(1,"Mani");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        ArrayList<Integer> userInputList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements (type 'quit' to finish):");

        while (true) {
            System.out.print("Enter element: ");
            try {
                int input1 = scanner.nextInt();

                userInputList.add(input1);
            } catch (InputMismatchException e) {
                String input1 = scanner.next();
                if (input1.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'quit' to finish.");
                }
            }
        }

        // Sort the ArrayList in ascending order
        Collections.sort(userInputList);

        System.out.println("ArrayList from user input:");
        System.out.println(userInputList);
    }
}