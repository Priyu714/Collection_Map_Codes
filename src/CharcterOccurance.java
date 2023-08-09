import java.util.HashMap;
import java.util.Map;

public class CharcterOccurance {

    public static void main(String[] args) {
        String str = "something somethg";
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for(char ch :str.toCharArray())
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch, 0) + 1);

        System.out.println(characterIntegerMap);
    }


}
