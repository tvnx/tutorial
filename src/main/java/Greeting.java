public class Greeting {
	private final String addressee;

	public Greeting(String addressee) {
		this.addressee = addressee;
	}

	public void greet() {
		System.out.println("Hello, " + addressee + "!");
	}

	public static void main(String[] args) {
		Greeting g = new Greeting("Korbinian");
		g.greet();
	}
}
