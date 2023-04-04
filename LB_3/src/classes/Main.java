package classes;

public class Main {

	public static void main(String[] args) {
		IOperation[] operations = {
			new Addition(), new Subtraction(),
			new Multiplication(), new Maximum()
		};

		int a = 100, b = 20;
		for (IOperation op : operations) {
			System.out.println(op.getName());
			System.out.printf("%d %s %d = %d\n",
					a, op.getSign(), b, op.estimate(a,  b));
		}
	}

}
