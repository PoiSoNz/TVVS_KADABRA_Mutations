

public class ConstantDeletionTest {
    final int a = 14;

    final int b = 21321;

    final int c = 1212;

    final int d = 244;

    public ConstantDeletionTest() {
        int e = a;
        e = b;
        e = 3;
        int f = (a) * 3;
        f = (a) + (a);
        f = (((b) + (c)) - (d)) + 3;
        if ((c) < (((d) + ((3 * (a)) / (c))) - 2)) {
            f = ((b) / (a)) + (d);
            boolean i = (((c) + (d)) + 2) > (((a) + ((3 * (b)) / (d))) - 2);
        }
    }
}

