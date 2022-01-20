public class PrefixCode {
    
    public String isOne(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].length() <= words[j].length()) {
                    if (words[i].equals(words[j].substring(0, words[i].length()))) {
                        return "No, " + i;
                    }
                }
            }
        }
        return "Yes";
    }

}
