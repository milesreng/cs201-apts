public class TrueSpace {

    public long calculateSpace(int[] sizes, int clusterSize) {
        int clusters;
        long longClusters;

        long totalClusters = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] != 0) {
                clusters = (sizes[i] / clusterSize);
                if (sizes[i] % clusterSize != 0) {
                    longClusters = clusters + 1L;
                } else {
                    longClusters = clusters;
                }
                totalClusters += longClusters;
            }
        }

        return totalClusters * clusterSize;

    }
    
}
