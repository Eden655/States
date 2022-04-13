import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========SEARCHING=============");
        System.out.println("Would you like to find a state? [y/n]");
        Scanner keyboard = new Scanner(System.in);
        String ans = keyboard.nextLine();
        while (ans.equalsIgnoreCase("y")) {
            System.out.print("Enter state name -->");
            keyboard = new Scanner(System.in);
            String key = keyboard.nextLine();
            System.out.println();

            SearchStates n = new SearchStates(key);
            System.out.println("Would you like to find a state? [y/n]");
            keyboard = new Scanner(System.in);
            ans = keyboard.nextLine();

        }


    }
}
