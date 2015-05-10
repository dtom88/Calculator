package calculator;

public class Calculator {
	
	abstract class Operator {
		public void execute() {
			realExecute();
			System.out.println(total);
		}

		abstract void realExecute();
	}
	
	public class Plus extends Operator {
		int _value;
		Plus(final int value) {
			_value = value;
		}
		@Override
		void realExecute() {
			total += _value;
		}
	}
	
	public class Minus extends Plus {
		Minus(final int value) {
			super(-value);
		}
	}
	
	public class Clear extends Operator {
		@Override
		void realExecute() {
			total = 0;
		}
	}
	
	public class Get extends Operator {

		@Override
		void realExecute() {
			// do nothing
		}

	}
	
	int total = 0;
		

}
