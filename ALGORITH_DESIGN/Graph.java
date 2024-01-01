import java.util.*;

public class Graph {
	static class edge {
		int dest;
		int src;

		edge(int s, int d) {
			dest = d;
			src = s;
		}
	}

	static void create(ArrayList<edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
//		GRAPH 1
//		graph[0].add(new edge(0, 1));
//		graph[0].add(new edge(0, 2));
//
//		graph[1].add(new edge(1, 0));
//		graph[1].add(new edge(1, 3));
//
//		graph[2].add(new edge(2, 0));
//		graph[2].add(new edge(2, 4));		
//
//		graph[3].add(new edge(3, 1));
//		graph[3].add(new edge(3, 4));
//		graph[3].add(new edge(3, 5));		
//
//		graph[4].add(new edge(4, 2));
//		graph[4].add(new edge(4, 3));
//		graph[4].add(new edge(4, 5));	
//
//		graph[5].add(new edge(5, 3));
//		graph[5].add(new edge(5, 4));
//		graph[5].add(new edge(5, 6));
//
//		graph[6].add(new edge(6, 5));
//		GRAPH 2 Topological Order
//		graph[2].add(new edge(2, 3));
//		graph[3].add(new edge(3, 1));
//		graph[4].add(new edge(4, 0));
//		graph[4].add(new edge(4, 1));
//		graph[5].add(new edge(5, 0));
//		graph[5].add(new edge(5, 2));
//		GRAPH 3 Cycle Detection
//		graph[0].add(new edge(0, 1));
//		graph[0].add(new edge(0, 4));
//
//		graph[1].add(new edge(1, 0));
//		graph[1].add(new edge(1, 2));
//		graph[1].add(new edge(1, 4));
//
//		graph[2].add(new edge(2, 1));
//		graph[2].add(new edge(2, 3));
//
//		graph[3].add(new edge(3, 2));
//
//		graph[4].add(new edge(4, 0));
//		graph[4].add(new edge(4, 1));
//		graph[4].add(new edge(4, 5));
//
//		graph[5].add(new edge(5, 4));
//		GRAPH 5 Strongly Connected
		graph[0].add(new edge(0, 2));
		graph[0].add(new edge(0, 3));

		graph[1].add(new edge(1, 0));

		graph[2].add(new edge(2, 1));

		graph[3].add(new edge(3, 4));

	}

	static void bfs(ArrayList<edge> graph[], int v) {
		boolean vis[] = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		while (!q.isEmpty()) {
			int curr = q.remove();
			if (vis[curr] == false) {
				vis[curr] = true;
				System.out.print(curr + " ");
				for (int i = 0; i < graph[curr].size(); i++) {
					edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	static void dfs(ArrayList<edge> graph[], int curr, boolean vis[]) {
		System.out.print(curr + " ");
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			if (!vis[e.dest])
				dfs(graph, e.dest, vis);
		}
	}

	static void dfsUsingStack(ArrayList<edge> graph[], int v) {
		Stack<Integer> s = new Stack<>();
		boolean vis[] = new boolean[v];
		s.add(0);
		while (!s.isEmpty()) {
			int curr = s.pop();
			if (!vis[curr]) {
				System.out.print(curr + " ");
				vis[curr] = true;

				for (int i = graph[curr].size() - 1; i >= 0; i--) {
					edge e = graph[curr].get(i);
					if (!vis[e.dest]) {
						s.push(e.dest);
					}
				}
			}
		}
	}

	static void printAllPath(int curr, int tar, boolean vis[], ArrayList<edge> graph[], String path) {
		if (curr == tar) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			if (!vis[curr]) {
				vis[curr] = true;
				printAllPath(e.dest, tar, vis, graph, path + e.dest);
				vis[curr] = false;
			}
		}

	}

	public static boolean CycleDetection(ArrayList<edge> graph[], boolean vis[], boolean[] already, int curr) {
		vis[curr] = true;
		already[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			if (already[e.dest])
				return true;
			else if (!vis[e.dest])
				if (CycleDetection(graph, vis, already, e.dest))
					return true;
		}
		already[curr] = false;
		return false;
	}

	public static boolean CycleDetectionUndirected(ArrayList<edge> graph[], boolean vis[], int parent, int curr) {
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			if (vis[e.dest] && parent != e.dest) {
				return true;
			} else if (!vis[e.dest]) {
				if (CycleDetectionUndirected(graph, vis, curr, e.dest))
					return true;
			}
		}
		return false;
	}

	public static void topological(ArrayList<edge> graph[], int v) {
		boolean vis[] = new boolean[v];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				topologicalhelper(graph, vis, s, i);
			}
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

	public static void topologicalhelper(ArrayList<edge> graph[], boolean vis[], Stack<Integer> s, int curr) {
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			edge e = graph[curr].get(i);
			if (!vis[e.dest])
				topologicalhelper(graph, vis, s, e.dest);
		}
		s.push(curr);
	}

//	check Strongly Connected	
	static void KosarajuAlgo(ArrayList<edge> graph[], int V) {
//	step 1
		Stack<Integer> s = new Stack<>();
		boolean vis[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			if (!vis[i]) {
				topologicalhelper(graph, vis, s, i);
			}
		}
//	step 2
		ArrayList<edge> transpose[] = new ArrayList[V];
		for (int i = 0; i < graph.length; i++) {
			vis[i] = false;
			transpose[i] = new ArrayList<>();
		}
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				edge e = graph[i].get(j);
				transpose[e.dest].add(new edge(e.dest, e.src));
			}
		}
//	step 3
		while (!s.isEmpty()) {
			int curr = s.pop();
			if (!vis[curr]) {
				dfs(transpose, curr, vis);
				System.out.println();
			}

		}

	}

	static ArrayList<edge>[] reverse(ArrayList<edge> graph[], int V) {
		ArrayList<edge> transpose[] = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				edge e = graph[i].get(j);
				transpose[e.dest].add(new edge(e.dest, e.src));
			}
		}
		return transpose;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int v = 7;
//		ArrayList<edge> graph[] = new ArrayList[v];
//		create(graph);
//		bfs(graph, v);
//		0 1 2 3 4 5 6 
//		boolean vis[] = new boolean[v];
//		boolean[] already = new boolean[v];
		// dfs(graph, 0, vis);
//		0 1 3 4 2 5 6 
//		dfsUsingStack(graph, v);
//		0 1 3 4 2 5 6 
//		printAllPath(0, 6, vis, graph, "0");
//		 013456
//		 01356
//		 024356
//		 02456
//		for (int i = 0; i < v; i++) {
//			boolean yes = false;
//			;
//			if (!vis[i]) {
//				yes = CycleDetection(graph, vis, already, i);
//
//			}
//			if (yes) {
//				System.out.println(yes);
//				break;
//			}
//		}
//		true
//		int v=6;
//		ArrayList<edge> graph2[] = new ArrayList[v];
//		create(graph2);
//		topological(graph2, v);
//		5 4 2 3 1 0 
//		int v = 6;
//		ArrayList<edge> graph3[] = new ArrayList[v];
//		create(graph3);
//		boolean vis[] = new boolean[v];
//		System.out.println(CycleDetectionUndirected(graph3, vis, -1, 0));
//		true;
//		int v = 5;
//		ArrayList<edge> graph4[] = new ArrayList[v];
//		create(graph4);
//		KosarajuAlgo(graph4, v);
//		0 1 2 
//		3 
//		4 
	}

}
