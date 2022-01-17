public class TrueSpace {

    public long calculateSpace(int[] sizes, int clusterSize) {
        long clusters;

        long totalClusters = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] != 0) {
                clusters = (sizes[i] / clusterSize);
                if (sizes[i] % clusterSize != 0) {
                    totalClusters += clusters + 1;
                } else {
                    totalClusters += clusters;
                }
            }
        }

        long total = totalClusters * clusterSize;

        return total;

    }
    
}
