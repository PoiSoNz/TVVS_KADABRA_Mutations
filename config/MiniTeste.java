

public class MiniTeste extends GrandeTeste {
    public MiniTeste() {
        super();
        int v = intMethod();
    }

    @Override
    public int testOverride() {
        int d = intMethod();
        return 0;
    }

    public int intMethod() {
        return 1;
    }

    public short shortMethod() {
        return 2;
    }

    public long longMethod() {
        return 3;
    }

    public char charMethod() {
        return 'a';
    }

    public float floatMethod() {
        return 2;
    }

    public double doubleMethod() {
        return 2;
    }

    public boolean primitiveBooleanMethod() {
        return false;
    }

    public Boolean boxedBooleanMethod() {
        Boolean b = false;
        return b;
    }

    public void voidMethod() {
        return;
    }
}

