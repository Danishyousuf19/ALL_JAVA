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
		graph[0].add(new edge(0, 1));
		graph[0].add(new edge(0, 2));

		graph[1].add(new edge(1, 0));
		graph[1].add(new edge(1, 3));

		graph[2].add(new edge(2, 0));
		graph[2].add(new edge(2, 4));

		graph[3].add(new edge(3, 1));
		graph[3].add(new edge(3, 4));
		graph[3].add(new edge(3, 5));

		graph[4].add(new edge(4, 2));
		graph[4].add(new edge(4, 3));
		graph[4].add(new edge(4, 5));

		graph[5].add(new edge(5, 3));
		graph[5].add(new edge(5, 4));
		graph[5].add(new edge(5, 6));

		graph[6].add(new edge(6, 5));
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
//problem infinte loop in cycle
//	static void printAllPathUsingStack(int v, int start, int tar, ArrayList<edge> graph[]) {
//		Stack<Integer> s = new Stack<>();
//		boolean vis[] = new boolean[v];
//		List<Integer> path = new ArrayList<>();
//	    path.add(start);
//		
//		while (!s.isEmpty()) {
//			int curr = s.peek();
//			if (curr == tar) {
//				System.out.println(path);
//				path.remove(path.size() - 1);
//				s.pop();
//				continue;
//
//			}
//			 boolean hasUnvisitedNode = false;
//			for (int i = graph[curr].size() - 1; i >= 0; i--) {
//				edge e = graph[curr].get(i);
//				 if (!vis[e.dest]) {
//		                vis[e.dest] = true;
//		                path.add(e.dest);
//		                s.push(e.dest);
//		                hasUnvisitedNode = true;
//		                break;
//		            }
//			}
//			if (!hasUnvisitedNode) {
//	            vis[curr] = false;
//	            path.remove(path.size() - 1);
//	            s.pop();
//	        }
//
//		}
//	}

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
				return CycleDetection(graph, vis, already, e.dest);
		}
		already[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 7;
		ArrayList<edge> graph[] = new ArrayList[v];
		create(graph);
//		bfs(graph, v);
//		0 1 2 3 4 5 6 
		boolean vis[] = new boolean[v];
		boolean[] already = new boolean[v];
		// dfs(graph, 0, vis);
//		0 1 3 4 2 5 6 
//		dfsUsingStack(graph, v);
//		0 1 3 4 2 5 6 
//		printAllPath(0, 6, vis, graph, "0");
//		 013456
//		 01356
//		 024356
//		 02456
		for (int i = 0; i < v; i++) {
			boolean yes = false;
			;
			if (!vis[i]) {
				yes = CycleDetection(graph, vis, already, i);

			}
			if (yes) {
				System.out.println(yes);
				break;
			}
		}
	}

}
