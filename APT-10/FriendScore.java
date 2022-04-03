import java.util.*;

public class FriendScore {
    public Map<Integer, Set<Integer>> myGraph = new HashMap<>();

    public int highestScore(String[] friends) {
        for (int i = 0; i < friends.length; i++) {
            myGraph.put(i, new HashSet<Integer>());
            for (int j = 0; j < friends[i].length(); j++) {
                if (friends[i].substring(j, j + 1).equals("Y")) {
                    myGraph.get(i).add(j);
                }
            }

        }

        int maxFriends = 0;
        for (int i = 0; i < friends.length; i++) {
            int numFriends = twoFriends(i).size();
            if (numFriends > maxFriends) {
                maxFriends = numFriends;
            }
        }

        return maxFriends;
    }

    private Set<Integer> twoFriends(int index) {
        Set<Integer> set = new TreeSet<Integer>();
        Set<Integer> friends = myGraph.get(index);
        set.addAll(friends);
        for (int friend : friends) {
            set.addAll(myGraph.get(friend));
        }
        set.remove(index);
        return set;
    }
}