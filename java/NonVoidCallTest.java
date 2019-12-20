public class NonVoidCallTest {
	
	protected int K = 0;
	
	public NonVoidCallTest() {
		K = 3;
		int c = ~K;
		int d = K;
		int e = ~5;
		K += 1;
		K = ~K;
		K = K | 4;
		calls();
	}
	
	public void calls() {
		int a = this.intMethod(1, 2);
		int aa = this.intMethod(23, 12) * this.intMethod(0, 1233) + intMethod(-12, 13);
		a = this.intMethod(10, 11) * 2;
		a += 2 * this.intMethod(10, 11);
		K = intMethod(10, 11);
		intMethod(10, 11);
		short b = shortMethod();
		shortMethod();
		long c = longMethod();
		longMethod();
		byte d = this.byteMethod();
		byteMethod();
		char e = charMethod();
		this.charMethod();
		String f = stringMethod();
		stringMethod();
		float g = floatMethod();
		floatMethod();
		double h = this.doubleMethod();
		doubleMethod();
		boolean i = primitiveBooleanMethod();
		primitiveBooleanMethod();
		Boolean j = this.boxedBooleanMethod();
		boxedBooleanMethod();
		TestObjectClass k = objectMethod();
		this.objectMethod();
		
		voidMethod();
		this.voidMethod();
		
		if(this.doubleMethod() * doubleMethod() < this.intMethod(10, 11)) {
			this.objectMethod();
			return;
		}
		
		if(!this.primitiveBooleanMethod())
			return;
		
		if(!primitiveBooleanMethod() && this.boxedBooleanMethod())
			return;
		
		int ternary1 = this.doubleMethod() > 3 ? intMethod(1, 2) : intMethod(10, 11);
		
		while(this.doubleMethod() < 2)
		{
			String ff = stringMethod();
			this.doubleMethod();
		}
	}
	
	public int intMethod(int a1, int b2) {
		String b = "ola";
		String c = "aasd" + b;
		return 1;
	}

	public short shortMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 2;
	}
	
	public long longMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 3;
	}
	
	public byte byteMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 4;
	}
	
	public char charMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 'a';
	}
	
	public String stringMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return c;
	}
	
	public float floatMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 5;
	}
	
	public double doubleMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 6;
	}
	
	public boolean primitiveBooleanMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return false;
	}
	
	public Boolean boxedBooleanMethod() {
		String b = "ola";
		String c = "aasd" + b;
		Boolean boleano = false;
		return boleano;
	}
	
	public void voidMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return;
	}
	
	public TestObjectClass objectMethod() {
		return new TestObjectClass();
	}
	
	public class TestObjectClass {
		
		public TestObjectClass() {
		
		}
	}
}