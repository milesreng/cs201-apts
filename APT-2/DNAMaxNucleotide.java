public class DNAMaxNucleotide {

    public String max(String[] strands, String nuc) {
        String longest = strands[0];
        int count = 0;

        for (int i = 0; i < strands.length; i++) {
            int newCount = 0;
            for (int j = 0; j < strands[i].length(); j++) {
                if (strands[i].charAt(j) == nuc.charAt(0)) {
                    newCount++;
                }
            }
            if (newCount > count) {
                longest = strands[i];
                count = newCount;
            } else if (newCount == count && strands[i].length() > longest.length()) {
                longest = strands[i];
            }
        }

        if (count == 0) {
            return "";
        }
        return longest;
    }
    
}