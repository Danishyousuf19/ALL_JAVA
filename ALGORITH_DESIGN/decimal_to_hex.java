
public class decimal_to_hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(hex(41, c));
	}

	static String hex(int i, char c[]) {

		if (i <= 15)
			return "" + c[i];
		return hex(i / 16, c) + c[i % 16];
	}

}
