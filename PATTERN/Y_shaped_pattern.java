
public class Y_shaped_pattern {
	static String[] yShapedPattern(int N) {
	    String[] s = new String[N];
	    for (int i = 0; i < N; i++) {
	        StringBuilder n = new StringBuilder();
	        for (int j = 0; j <= N; j++) {
	            if (i < N / 2) {
	                if (j == i || j == N - i) {
	                    n.append("*");
	                } else {
	                    n.append(" ");
	                }
	            } else {
	                if (j != N / 2) {
	                    n.append(" ");
	                } else if (j == N / 2) {
	                    n.append("*");
	                }
	            }
	        }
	        s[i] = n.toString();
	    }
	    return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
