public class Totality {
    public int sum(int[] a, String stype) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (stype == "odd" && i % 2 != 0) {
                total += a[i];
            } else if (stype == "even" && i % 2 == 0) {
                total += a[i];
            } else if (stype == "all") {
                total += a[i];
            }
        }
        return total;
    }

}
