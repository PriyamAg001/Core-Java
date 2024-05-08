import java.util.HashSet;

public class commonCharactersinBothStrings {
    public static void main(String[] args) {
        System.out.println(findUncommonCharacters("characters", "alphabets"));
        System.out.println(findUncommonCharacters("bbbbb", "bb"));
    }

    public static String findUncommonCharacters(String A, String B) {
        HashSet<Character> setA = new HashSet<>();
        HashSet<Character> setB = new HashSet<>();
        HashSet<Character> resultSet = new HashSet<>();

        for (char c : A.toCharArray()) {
            setA.add(c);
        }

        for (char c : B.toCharArray()) {
            if (!setA.contains(c)) {
                resultSet.add(c);
            } else {
                setB.add(c);
            }
        }

        for (char c : setA) {
            if (!setB.contains(c)) {
                resultSet.add(c);
            }
        }

        if (resultSet.isEmpty()) {
            return "-1";
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : resultSet) {
                sb.append(c);
            }
            return sb.toString();
        }
    }
}
