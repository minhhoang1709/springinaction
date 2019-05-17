package others;

public class OthersMain {
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		System.out.println("publicNUM: "+outer.publicNum);
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.getNum());
	}
}
