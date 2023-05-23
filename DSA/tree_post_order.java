
public class tree_post_order {
static class node{
	int data;
	node left;
	node right;
	node(int d){
		this.data=d;
		this.left=null;
		this.right=null;
	}
}
static class binarytry{
	static int idx=-1;
	node build(int nodes []) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		node newnode=new node(nodes[idx]);
		newnode.left=build(nodes);
		newnode.right=build(nodes);
		return newnode;
	}
	void postorder(node root) {
		if(root==null) {
			return ;		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binarytry tree=new binarytry() ;
		node root=tree.build(nodes);
		tree.postorder(root);

	}

}
