package others;

abstract class AnonymousInnerClass {
	public abstract void mymethod();
}

public class Outer2Class {
	public static void main(String args[]) {
		AnonymousInnerClass inner = new AnonymousInnerClass() {
			public void mymethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();
	}
}