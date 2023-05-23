

public class tree_height {

	static class node{
		int data;
		node right;
		node left;
		node(int g){
			this.data=g	;
			right=null;
			left=null;
		}
	}
	static class binarytees{
	static	int idx=-1;
	node build(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		node nue=new node(nodes[idx]);
		nue.left=build(nodes);
		nue.right=build(nodes);
		return nue;
	}
	public static int hight(node root) {
		if(root==null) {
			return 0;		}

	int left_hight=hight(root.left);
	int right_hight=hight(root.right);
	int total=Math.max(left_hight, right_hight)+1;
	return total;
	}
	}
		public static void main(String[] args) {
			int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
			binarytees tree=new binarytees();
	node root =tree.build(nodes);
System.out.println("Total height : "+tree.hight(root));


		}

	}
	
//Total height : 3
