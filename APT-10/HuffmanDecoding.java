public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        int i = 0;
        String bit = "";
        String message = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (i < archive.length()) {
            bit += archive.substring(i, i + 1);
            for (int j = 0; j < dictionary.length; j++) {
                if (bit.equals(dictionary[j])) {
                    message += alphabet.substring(j, j + 1);
                    bit = "";
                }
            }
            i++;
        }
        
        return message;
    }
}