package n1exercici2;

public class GenericMethods<T> {

	private T generic1;
	private T generic2;
	private T generic3;

	public GenericMethods(T generic1, T generic2, T generic3) {
		super();
		this.generic1 = generic1;
		this.generic2 = generic2;
		this.generic3 = generic3;
	}


	public GenericMethods() {
		super();
	}


	public <T> void printArguments(T generic1, T generic2, T generic3) {
		System.out.println("Objecte 1: " + generic1);
		System.out.println("Objecte 2: " + generic2);
		System.out.println("Objecte 3: " + generic3);
	}
}