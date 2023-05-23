
public class tree_diameter_APPROACH_2_O_n {



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
	static class info {
		int ht;
		int diam;
		info(int h,int d){
			this.ht=h;
			this.diam=d;
		}
	}
	info diameter2(node root) {
		if(root==null) {
			return new info(0,0);
		}
		info left=diameter2(root.left);
		info right=diameter2(root.right);
		
		int my_hight=Math.max(left.ht, right.ht)+1;
		int d1=left.diam;
		int d2=right.diam;
		int d3=left.ht+right.ht+1;
		int my_diam= (Math.max(d2, Math.max(d1, d3)));
				info my_info=new info(my_hight,my_diam);
				return my_info;		
	}
	}
		public static void main(String[] args) {
			int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
			binarytees tree=new binarytees();
	 node root =tree.build(nodes);
      System.out.println("diameter : "+tree.diameter2(root).diam);

		
		}

}
	
//diameter : 5 
