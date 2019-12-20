public class ConditionalOperatorInsertionTest{
	
	public int k = 0;
	
	public ConditionalOperatorInsertionTest() {
		
		Boolean a = true;
		
		if(a)
			k += 1;
		
		if(k > 0)
			k += 10;
		
		if(!a)
			k = 0;
		
		if(a && k > 0)
			k += 100;
		
		if(k == 0 || ( a && k > 0))
			k += 1000;
		
		String s = (k > 0) ? "q" : "w";
		
		String s2 = (a && k > 0) ? "e" : "r";
		
		String s3 = (k == 0 || ( a && k > 0)) ? "a" : "s";
		
		String s4 = (!(k == 0 || ( a && k > 0))) ? "d" : "f";
		
		String s5 = (!a) ? "d" : "f";
		
		while(a) {
			a = !a;
		}
		
		while(!a) {
			a = !a;
		}
		
		while(k == 0 || ( a && k > 0)) {
			k--;
		}
		
		while(!(k == 0 || ( a && k > 0))) {
			k--;
		}
		
		for(int i = 0; i < 50; i++) {
			k++;
		}
		
		for(int i = 0; !(i > 50); i++) {
			k++;
		}
	}
}
