

public class ConstructorCallTest {
    public class Class1 {
        public int x = -1;

        public Class1() {
            x = 0;
        }
    }

    public class Class2 {
        public ConstructorCallTest.Class1 obj;

        public Class2(ConstructorCallTest.Class1 obj) {
            this.obj = obj;
        }
    }

    public ConstructorCallTest.Class1 obj;

    public ConstructorCallTest() {
        this.obj = new ConstructorCallTest.Class1();
        ConstructorCallTest.Class2 test = new ConstructorCallTest.Class2(new ConstructorCallTest.Class1());
    }
}

