
public class tree_diameter_APPROACH_1_O_n2 {

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
	static int diameter (node root) {
		if(root==null) {
			return -1;
			
		}
		int d1=diameter(root.left);
		int d2=diameter(root.right);
		int d3=hight(root.left)+hight(root.right)+1;
		return (Math.max(d2, Math.max(d1, d3)));
	}
	}
		public static void main(String[] args) {
			int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
			binarytees tree=new binarytees();
	node root =tree.build(nodes);
System.out.println("diameter : "+tree.diameter(root));

		
		}

	}
	
//diameter : 5 
