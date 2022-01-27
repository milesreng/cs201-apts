import java.util.*;
import java.lang.*;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        ArrayList<Character> chars = new ArrayList<Character>();
        for (String headline : headlines) {
            for (int i = 0; i < headline.length(); i++) {
                if (!headline.substring(i, i + 1).equals(" ")) {
                    chars.add(Character.toLowerCase(headline.charAt(i)));
                    System.out.print(headline.substring(i, i + 1).toLowerCase());
                }
            }
        }

        int count = 0;
        for (String message : messages) {
            Boolean hasChars = true;
            ArrayList<Character> availChars = chars;

            message = message.toLowerCase();
            System.out.println("\n" + message);
            for (int i = 0; i < message.length(); i++) {
                Character mess = Character.toLowerCase(message.charAt(i));
                if (!mess.equals(' ')) {
                    if (!availChars.contains(mess)) {
                        hasChars = false;
                    } else {
                        availChars.remove(availChars.indexOf(mess));
                    }
                }
            }
            if (hasChars) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        String[] hl = {"Earthquake in San Francisco ", " Burglary at musuem in Sweden ", " Poverty "};
        String[] m = {"Give me my money back ", " I am the best coder ", " TOPCODER "};
        System.out.print(a.howMany(hl, m));
    }
}