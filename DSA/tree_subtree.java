
public class tree_subtree {
static class node {
	int data ;
	node right;
	node left;
	node(int h){
		this.data=h;
		this.right=null;
		this.left=null;
	}
}
		static class binarytr{
		 static int i=-1;
		  node build(int []nodes) {
			  i++;
	            if (i >= nodes.length || nodes[i] == -1) {
	                return null;
	            }
			  node nue=new node (nodes[i]);
			  nue.left=build(nodes);
			  nue.right=build(nodes);
			  return nue;
		  }
		   boolean isSame(node tree,node subtree) {
			  if(tree==null&&subtree==null) {
				  return true;
			  }if(tree==null||subtree==null) {
				  return false;
			  }
			  if (tree.data == subtree.data && isSame(tree.left, subtree.left) && isSame(tree.right, subtree.right)) {
	                return true;
	            }
			  return false;
		  }
		  boolean IsSubTree(node tree,node subtree) {
			  if(subtree==null) {
				  return true;
						  
			  }
			  if(tree==null) {
				  return false;
			  }
			  if(tree.data==subtree.data) {
				  if(isSame(tree, subtree)) {
					  return true;
				  }
			  }
			  return (IsSubTree(tree.left,subtree)||IsSubTree(tree.right,subtree));
		  }
		 
		}
	public static void main(String[] args) {
		int[] treenodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		int[] subtreenodes = {2, 4, -1, -1, 5, -1, -1};
		binarytr tre=new binarytr();
		node treeroot=tre.build(treenodes);
		node subtreeroot=tre.build(subtreenodes);
		System.out.println("Is Subtree "+(tre.IsSubTree(treeroot,subtreeroot)));
	}

}
