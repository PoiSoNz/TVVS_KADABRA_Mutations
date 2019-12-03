

public class MiniTeste extends GrandeTeste {
    public MiniTeste() {
        // super();
        int v = abc();
        // return 0;
    }

    @Override
    public int testOverride() {
        int d = abc();
        return 0;
    }

    public int abc() {
        return 2;
    }
}

