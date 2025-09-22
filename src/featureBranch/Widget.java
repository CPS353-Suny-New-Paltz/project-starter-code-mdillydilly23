
public class Widget {
	
	private final Foo foo;

	public Widget(Foo foo) {
		this.foo = foo;
	}
	
	public int addNumbers(int a, int b) {
		if (foo.validate(a) && foo.validate(b)) {
			return a + b;
		}
		throw new IllegalStateException("Invalid input!");
	}
}
