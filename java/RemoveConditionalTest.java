public class RemoveConditionalTest {
	
	public void calls() {
		
		if(this.doubleMethod() * doubleMethod() < this.intMethod(10, 11))
			return;
		
		if(!this.primitiveBooleanMethod())
			return;
		
		if(!primitiveBooleanMethod() && this.boxedBooleanMethod())
			return;
		
		if(false)
			return;
		
		if(this.boxedBooleanMethod()) {
			if(stringMethod() == "teste") {
				return;
			} else if(this.intMethod(10, 11) * 2 < this.intMethod(4, 12)) {
				boxedBooleanMethod();
			} else if(this.intMethod(10, 11) == 4) {
				boxedBooleanMethod();
				int ternary1 = this.doubleMethod() + 2 >= 3 ? 5 : 7;
			} else {
				return;
			}
			boolean bol = primitiveBooleanMethod();
			boolean i = true;
			if(i == true) {
				i = false;
			}
			
			if(objectMethod() == null) {
				return;
			}
		} else if(this.primitiveBooleanMethod()) {
			if(this.doubleMethod() < 4.3) {
				return;
			} else if(this.intMethod(10, 11) == 4) {
				boxedBooleanMethod();
			}
		} else {
			return;
		}
		
		while(this.doubleMethod() < 2)
		{
			String ff = stringMethod();
		}
		
		int ternary2 =  this.doubleMethod() >= 3 ? 5 : 18;
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