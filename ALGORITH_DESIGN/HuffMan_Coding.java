import java.util.HashMap;
import java.util.Map.Entry;

public class HuffMan_Coding {
	HashMap<Character, String> Encoder;
	HashMap<String, Character> Decoder;

	class node implements Comparable<node> {
		int cost;
		node left;
		Character data;
		node right;

		node(Character d, int c) {
			cost = c;
			data = d;
			left = null;
			right = null;
		}

		@Override
		public int compareTo(node n) {
			// TODO Auto-generated method stub
			return this.cost - n.cost;
		}
	}

	public void huffmancoding(String str) throws Exception {
		HashMap<Character, Integer> freq = new HashMap<>();
		for (char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		heap<node> minheap = new heap<>();
		for (Entry<Character, Integer> entry : freq.entrySet()) {
			node n = new node(entry.getKey(), entry.getValue());
			minheap.insert(n);
		}
		while (minheap.size() != 1) {
			node firstMin = minheap.remove();
			node secondMin = minheap.remove();
			node nue = new node('\0', firstMin.cost + secondMin.cost);
			nue.left = firstMin;
			nue.right = secondMin;
			minheap.insert(nue);
		}
		node root = minheap.remove();
		this.Encoder = new HashMap<>();
		this.Decoder = new HashMap<>();
		this.EncoderDecoder(root, "");
	}

	public void EncoderDecoder(node root, String res) {
		if (root == null)
			return;
		if (root.right == null && root.left == null) {
			this.Encoder.put(root.data, res);
			this.Decoder.put(res, root.data);
		}
		EncoderDecoder(root.left, res+"0");
		EncoderDecoder(root.right, res+"1");
	}
	public String encode(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        sb.append(Encoder.get(s.charAt(i)));
	    }
	    return sb.toString();
	}
	public String decoder(String s) {
		String sb="";
		String key="";
		for(int i=0;i<s.length();i++) {
			key=key+s.charAt(i);
			if(Decoder.containsKey(key)) {
				sb=sb+Decoder.get(key);
				key="";
			}
		}
		return sb;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "abbccsfasfgoyfda";
	      HuffMan_Coding hf = new HuffMan_Coding();
	      hf.huffmancoding(str);
	    String cs = hf.encode(str);
	    System.out.println(cs);
	    String dc = hf.decoder(cs);
	    System.out.println(dc);
	    
//	    11010110100011
//	    abbccda
//
	}

}
