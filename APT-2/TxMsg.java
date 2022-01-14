public class TxMsg {

    public static String getMessage(String original) {
        String[] wordList = original.split(" ");
        int i;
        String abbr;

        for (i = 0; i < wordList.length; i++) {
            abbr = "";
            Boolean hasConsonant = false;

            for (int j = 0; j < wordList[i].length(); j++) {
                if ("aeiouAEIOU".indexOf(wordList[i].charAt(j)) == -1) {
                    if (j != 0 && "aeiouAEIOU".indexOf(wordList[i].charAt(j - 1)) != -1) {
                        abbr += wordList[i].charAt(j);
                    } else if (j == 0) {
                        abbr += wordList[i].charAt(j);
                    }
                    hasConsonant = true;
                }
            }
            if (hasConsonant) {
                wordList[i] = abbr;
            }
        }
        return String.join(" ", wordList);
    }
    
}
