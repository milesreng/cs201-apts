public class PairDown {
    public int[] fold(int[] list) {
        int[] newList = new int[(list.length + 1) / 2];
        for (int i = 0; i < list.length; i += 2) {
            if (i == list.length - 1) {
                newList[i / 2] = list[i];
            } else {
                newList[i / 2] = list[i] + list[i + 1];
            }
        }

        return newList;
    }
}