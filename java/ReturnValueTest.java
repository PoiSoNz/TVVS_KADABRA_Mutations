public class ReturnValueTest {
	
	public int intMethod() {
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
	
	public char charMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 'a';
	}
	
	public float floatMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 2;
	}
	
	public double doubleMethod() {
		String b = "ola";
		String c = "aasd" + b;
		return 2;
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
}