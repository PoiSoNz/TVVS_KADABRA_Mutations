

public class GrandeTeste {
    protected int K = 0;

    public int GrandeTeste() {
        K = 3;
        int c = ~(K);
        int d = K;
        int e = ~5;
        K += 1;
        K = ~(K);
        K = (K) | 4;
        Boolean b = (K) < 4;
        return K;
    }

    public int testOverride() {
        return 1;
    }
}

