public class CounterAttack {

    public int[] analyze(String str, String[] words) {
        String[] strList = str.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < strList.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(strList[i])) {
                    count[j]++;
                }
            }
        }
        return count;
    }
    
}
