import java.util.*;

public class Encryption {
    public String encrypt(String message) {
        HashMap<String, String> cypher = new HashMap<String, String>();

        String decoded = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphCounter = 0;
        for (int i = 0; i < message.length(); i++) {
            String currChar = message.substring(i, i + 1);
            if (!cypher.containsKey(currChar)) {
                cypher.put(currChar, alphabet.substring(alphCounter, alphCounter + 1));
                alphCounter++;
            }
            decoded += cypher.get(currChar);
        }
        return decoded;
    }
}