
public class tree_preorder_travalsal {
	static class node {
		int data;
		node right;
		node left;
		public node(int d){
			this.data=d;
			this.left=null;
			this.right=null;
		}
		
	}
static class binary{
	static int idx=-1;
	node buildroot(int[] nodes) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		node newnode =new node(nodes[idx]);
		newnode.left=buildroot(nodes);
		newnode.right=buildroot(nodes);
		return newnode;
		
	}
	void preorder(node root) {
	if(root==null) {
		return ;
		
	}
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);

}
}


	public static void main(String[] args) {
		int[] nodes = {1,2,3,-1,-1,4,-1,-1,3,-1,6,-1,-1};
		binary tree =new binary();
	node root=tree.buildroot(nodes);
				
	 tree.preorder(root);

	}

}
