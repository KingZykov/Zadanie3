package classes;

public class Multiplication implements IOperation {

	@Override
	public String getSign() {
		return "*";
	}

	@Override
	public String getName() {
		return "Multiplication";
	}

	@Override
	public int estimate(int a, int b) {
		return a*b;
	}

}
