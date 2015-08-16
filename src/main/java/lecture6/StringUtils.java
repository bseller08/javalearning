package lecture6;

public class StringUtils {

    public int countCharacters(String str, char ch) {
        int count = 0;
        if (str == null) return count;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

}
