public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] count = new int[matches.length];
        for (int i = 0; i < matches.length; i++) {
            for (int j = 0; j < matches[i].length(); j++) {
                Character curr = matches[i].charAt(j);
                if (curr == 'W') {
                    count[i] += 3;
                } else if (curr == 'D') {
                    count[i] += 1;
                    count[j] += 1;
                } else if (curr == 'L') {
                    count[j] += 3;
                }
            }
        }
        return count;
    }
}