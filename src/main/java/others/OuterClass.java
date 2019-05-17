package others;

public class OuterClass {
	private int privateNum = 179;
	public int publicNum = 1997;

	// innerclass
	public class InnerClass {
		public int getNum() {
			System.out.print("This is a method to get privateNum from outer: ");
			return privateNum;
		}
	}
}
