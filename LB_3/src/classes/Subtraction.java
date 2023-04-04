package classes;

public class Subtraction implements IOperation {

	@Override
	public String getSign() {
		return "-";
	}

	@Override
	public String getName() {
		return "Subtraction";
	}

	@Override
	public int estimate(int a, int b) {
		return a-b;
	}

}
