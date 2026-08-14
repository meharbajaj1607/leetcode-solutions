import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> arr = new ArrayList<>();

        for (String s : words) {
            String[] a = s.split(Pattern.quote(String.valueOf(separator)));

            for (String word : a) {
                if (!word.isEmpty()) {
                    arr.add(word);
                }
            }
        }

        return arr;
    }
}