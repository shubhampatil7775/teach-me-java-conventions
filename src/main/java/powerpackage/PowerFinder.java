package powerpackage;

public class PowerFinder {
    public static int of(int xyz, int pqr) {
        int p = 1;
        for (int i = 0; i<pqr; i++) {
            p *= xyz;
        }
        return p;
    }
}
