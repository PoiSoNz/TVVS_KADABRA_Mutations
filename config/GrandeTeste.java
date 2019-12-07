

public class GrandeTeste {
    protected int K = 0;

    public GrandeTeste() {
        super();
        K = 3;
        int c = ~(K);
        int d = K;
        int e = ~5;
        K += 1;
        K = ~(K);
        K = (K) | 4;
        Boolean b = (K) < 4;
        // return K;
    }

    public int ola() {
        int a = 2;
        return a;
    }

    public int testOverride() {
        return 1;
    }
}

