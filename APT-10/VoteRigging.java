public class VoteRigging {
    public int minimumVotes(int[] votes) {
        int votesChanged = 0;
        while (findMax(votes) != 0) {
            votes[findMax(votes)]--;
            votes[0]++;
            votesChanged++;
        }
        return votesChanged;
    }

    private int findMax(int[] votes) {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] >= max) {
                max = votes[i];
                idx = i;
            }
        }
        return idx;
    }
}