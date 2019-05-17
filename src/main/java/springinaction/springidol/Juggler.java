package springinaction.springidol;

public class Juggler implements Performer{

	private int beanBags = 3;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
		}
	
	@Override
	public void perform() throws PerformanceException {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
		
	}

}
