public class ConditionalOperatorDeletionTest{
	
	public ConditionalOperatorDeletionTest() {
		
		Boolean b = true;
		int i = 0;
		
		if(b) {
			i++;
			b = !b;
		}
		
		if(!b)
			i--;
		
		if(! (i > 3)) {
			i = 5;
		}
		
		String s = (i > 0) ? "q" : "w";
		
		String s2 = (b && i > 0) ? "e" : "r";
		
		String s3 = (i == 0 || ( b && i > 0)) ? "a" : "s";
		
		String s4 = (!(i == 0 || ( b && i > 0))) ? "d" : "f";
		
		String s5 = (!b) ? "d" : "f";
		
		while(b) {
			b = !b;
		}
		
		while(!b) {
			b = !b;
		}
		
		while(i == 0 || ( b && i > 0)) {
			i--;
		}
		
		while(!(i == 0 || ( b && i > 0))) {
			i--;
		}
		
		for(int t = 0; t < 50; t++) {
			i++;
		}
		
		for(int t = 0; !(t > 50); t++) {
			i++;
		}
	}
}
