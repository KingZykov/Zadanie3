package classes;

public class Maximum implements IOperation {

	@Override
	public String getSign() {
		return "MAX";
	}

	@Override
	public String getName() {
		return "Maximum";
	}

	@Override
	public int estimate(int a, int b) {
		return a>b ? a : b;
	}

}
