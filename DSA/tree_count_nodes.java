
public class tree_count_nodes {

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
	public static int count(node root) {
		if(root==null) {
			return 0;		}

	int leftcount=count(root.left);
	int rightcount=count(root.right);
	return leftcount+rightcount+1;
	}
	}
		public static void main(String[] args) {
			int[] nodes = {1,2,3,-1,-1,4,-1,-1,3,-1,6,-1,-1};
			binarytees tree=new binarytees();
	node root =tree.build(nodes);
System.out.println("Total number of Nodes : "+tree.count(root));


		}

	}
	
//Total number of Nodes : 6
