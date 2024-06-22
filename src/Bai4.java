import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Bai4 {

    // cách 1: dùng map
    public static StringBuilder removeDuplicateCharactersByMap(String s){
        Map<Character, Integer> stringMap = new LinkedHashMap<>();
        stringMap.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++){
            if(stringMap.containsKey(s.charAt(i))){
                Integer value = stringMap.get(s.charAt(i));
                stringMap.replace(s.charAt(i), ++value);
            }else{
                stringMap.put(s.charAt(i), 0);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character ch : stringMap.keySet()){
            stringBuilder.append(ch);
        }

        return stringBuilder;
    }

    // cách 2: dùng set
    public static StringBuilder removeDuplicateCharactersBySet(String s){
        Set<String> setString = new LinkedHashSet<>();
        for(int i = 0; i < s.length(); i++){
            setString.add(String.valueOf(s.charAt(i)));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String str : setString){
            stringBuilder.append(str);
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        String input = "characterscha";
        System.out.println("Output: " + removeDuplicateCharactersByMap(input)); // cách 1
        System.out.println("Output: " + removeDuplicateCharactersBySet(input)); // cách 2
    }
}
