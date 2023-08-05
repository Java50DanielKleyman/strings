package telran.strings;

public class Strings {
	static public String javaVariable() {

		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}

	static public String zero_300() {
		return "[1-9]\\d?|[1-2]\\d\\d|300|0";
	}

	static public String ipV4Octet() {
		// 0 - 255 with possible leading zeros
		return "(\\d\\d?|[0-1]\\d\\d|2([0-4]\\d|5[0-5]))";
	}

	static public String ipV4Address() {
		String octet = ipV4Octet();
		return String.format("%1$s(\\.%1$s){3}", octet);
	}

	public static String arithmeticExpression() {
		String regexOperand = operand();
		String regexOperator = operator();

//		return String.format("%s(\\s*%s\\s*%s)*", regexOperand, regexOperator, regexOperand);
	return  "(\\d+(\\.\\d+)?|[a-zA-Z_$][a-zA-Z0-9_$]*)([+\\-*/](\\d+(\\.\\d+)?|[a-zA-Z_$][a-zA-Z0-9_$]*))*";
	
	}

	private static String operator() {
//		return "((\\+)|(\\-)|(\\*)|(\\/))";
		 return "[+\\-*/]";
		
	}

	private static String operand() {
		 return "(?:\\d+(?:\\.\\d+)?|[a-zA-Z_][a-zA-Z0-9_]*)";
	//	return "(\\d+\\.\\d+|\\d+|\\w+)";
	}
}