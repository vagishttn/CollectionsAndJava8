import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String inputString = sc.nextLine();
        System.out.println("Character Count in String Are:");
        System.out.println(getCharacterOccurrence(inputString));
    }

    private static HashMap<Character, Integer> getCharacterOccurrence(String inputString) {
        char[] strings = inputString.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char element : strings) {
            Integer occurrence = map.getOrDefault(element, 0);
            map.put(element, occurrence + 1);
        }
       return map;
    }
}
