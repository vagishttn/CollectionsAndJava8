/*Write a method that takes a string and returns the number of unique characters in the string.*/

import java.util.*;

public class UniqueOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String inputString = sc.nextLine();
        System.out.println("Number Of Unique Character In String Are  ->  " + getUniqueOccurrence(inputString));


    }

    private static int getUniqueOccurrence(String inputString) {
        char[] strings = inputString.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (char element : strings) {
            set.add(element);
        }
        return set.size();
    }
}
