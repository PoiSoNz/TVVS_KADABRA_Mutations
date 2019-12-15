

public class ConditionalOperatorDeletionTest {
    public ConditionalOperatorDeletionTest() {
        Boolean b = true;
        int i = 0;
        if (b) {
            i++;
            b = !b;
        }
        if (!b)
            i--;

        if (!(i > 3)) {
            i = 5;
        }
    }
}

