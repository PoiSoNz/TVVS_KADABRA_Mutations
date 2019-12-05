public class MiniTeste extends GrandeTeste{

	public MiniTeste() {
		super();
		int v = abc();
		
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
