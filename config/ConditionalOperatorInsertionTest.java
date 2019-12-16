

public class ConditionalOperatorInsertionTest {
    public int k = 0;

    public ConditionalOperatorInsertionTest() {
        Boolean a = true;
        if (a)
            k += 1;

        if ((k) > 0)
            k += 10;

        if (!a)
            k = 0;

        if (a && ((k) > 0))
            k += 100;

        if (((k) == 0) || (a && ((k) > 0)))
            k += 1000;

    }
}

