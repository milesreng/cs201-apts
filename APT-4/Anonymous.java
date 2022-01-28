import java.util.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        ArrayList<Character> chars = new ArrayList<Character>();
        
        for (String headline : headlines) {
            for (int i = 0; i < headline.length(); i++) {
                if (headline.charAt(i) != ' ') {
                    chars.add(Character.toLowerCase(headline.charAt(i)));
                }
            }
        }

        int count = 0;
        for (String message : messages) {
            Boolean hasChars = true;
            ArrayList<Character> availChars = new ArrayList<Character>();
            availChars.addAll(chars);

            for (int i = 0; i < message.length(); i++) {
                if (message.charAt(i) != ' ') {
                    Character currChar = Character.toLowerCase(message.charAt(i));
                    if (availChars.contains(currChar)) {
                        availChars.remove(availChars.indexOf(currChar));
                    } else {
                        hasChars = false;
                        break;
                    }
                }
            }
            if (hasChars) {
                count++;
            }
        }

        return count;
    }
}