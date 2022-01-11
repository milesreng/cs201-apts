public class Totality {

    public int sum(int[] a, String stype) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (stype.equals("even") && i % 2 == 0) {
                total += a[i];
            } else if (stype.equals("odd") && i % 2 == 1) {
                total += a[i];
            } else if (stype.equals("all")) {
                total += a[i];
            }
        }
        return total;
    }

}
