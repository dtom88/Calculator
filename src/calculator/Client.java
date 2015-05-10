package calculator;

import java.util.LinkedList;

public class Client {

	static Calculator calc = new Calculator();

	public static void main(final String[] args) {

		LinkedList<String> list = new LinkedList<>();

		for (String string : args) {
			if (!isOperator(string)) {
				list.add(string);
			}
		}
		calc.total = Integer.parseInt(list.pop());

		for (String string : args) {
			if (isOperator(string)&&!list.isEmpty()) {
				setOperator(string, Integer.parseInt(list.pop()));
			}else{
				setOperator(string);
			}
		}
		System.out.println(calc.total);
	}

	private static void setOperator(final String str, final int argument) {
		if (str.equals("plus")) {
			calc.new Plus(argument).realExecute();
		}
		if (str.equals("minus")) {
			calc.new Minus(argument).realExecute();
		}
	}

	public static void setOperator(final String str) {
		if (str.equals("clear")) {
			calc.new Clear().realExecute();
		}
		if (str.equals("get")) {
			calc.new Get().execute();
		}
	}

	private static boolean isOperator(final String str) {
		if (str.equals("plus") || str.equals("minus") || str.equals("clear")
				|| str.equals("get")) {
			return true;
		} else {
			return false;
		}

	}
}