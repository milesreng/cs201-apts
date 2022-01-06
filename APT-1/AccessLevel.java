public class AccessLevel {

    public String canAccess(int[] rights, int minPermission) {
        String access = "";
        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) {
                access += "A";
            } else {
                access += "D";
            }
        }
        return access;
    }
    
}
