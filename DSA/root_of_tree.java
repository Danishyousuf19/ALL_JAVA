
public class root_of_tree {
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
static class binaryTree{
	static int idx=-1;
	static node buildtree(int nodes[]) {
		idx++;
		if(nodes[idx] == -1){
			return null;
		}
		node newnode=new node(nodes[idx]);
		newnode.left=buildtree(nodes);
		newnode.right=buildtree(nodes);
		return newnode;
	}
}
	public static void main(String[] args) {
		int[] nodes = {1,2,3,-1,-1,4,-1,-1,3,-1,6,-1,-1};
		binaryTree tree =new binaryTree();
	    node root=tree.buildtree(nodes);
	    System.out.println(root.data);

	}

}
//1