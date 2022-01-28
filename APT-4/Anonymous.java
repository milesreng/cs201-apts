public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int[] hlCounts = getCounts(headlines);

        int count = 0;
        for (String message : messages) {
            Boolean hasChars = true;

            String[] m = message.split(" ");
            int[] currCounts = getCounts(m);

            for (int i = 0; i < currCounts.length; i++) {
                if (hlCounts[i] < currCounts[i]) {
                    hasChars = false;
                    break;
                }
            }

            if (hasChars) {
                count++;
            }
        }

        return count;
    }

    private int[] getCounts(String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                counts[ch]++;
            }
        }
        return counts;
    }
}