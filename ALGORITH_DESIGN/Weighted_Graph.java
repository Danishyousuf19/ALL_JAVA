import java.util.ArrayList;
import java.util.PriorityQueue;

//9999<=max value
public class Weighted_Graph {
	static class edge {
		int src, dest, wt;

		edge(int s, int d, int w) {
			src = s;
			dest = d;
			wt = w;
		}
		public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        edge edge = (edge) o;
	        return src == edge.src && dest == edge.dest && wt == edge.wt;
	    }

	}

	static class pair implements Comparable<pair> {
		int node, dist;

		pair(int n, int d) {
			this.node = n;
			this.dist = d;
		}

		public int compareTo(pair p) {
			return this.dist - p.dist;
		}
	}

	static void create(ArrayList<edge> graph[], int v) {
		for (int i = 0; i < v; i++) {
			graph[i] = new ArrayList<edge>();
		}
//	Graph 1
		/*
		 * graph[0].add(new edge(0, 1,2)); graph[0].add(new edge(0, 2,4));
		 * 
		 * graph[1].add(new edge(1, 3,7)); graph[1].add(new edge(1, 2,1));
		 * 
		 * graph[2].add(new edge(2, 4,3));
		 * 
		 * graph[3].add(new edge(3, 5,1));
		 * 
		 * graph[4].add(new edge(4, 3,2)); graph[4].add(new edge(4, 5,5));
		 */
//	Graph 2
		/*
		 * graph[0].add(new edge(0, 1, 2)); graph[0].add(new edge(0, 2, 4));
		 * 
		 * graph[1].add(new edge(1, 2, -4));
		 * 
		 * graph[2].add(new edge(2, 3, 2));
		 * 
		 * graph[3].add(new edge(3, 4, 4));
		 * 
		 * graph[4].add(new edge(4, 1, -10));
		 */
// Graph 3
		graph[0].add(new edge(0, 1, 10));
		graph[0].add(new edge(0, 2, 15));
		graph[0].add(new edge(0, 3, 30));

		graph[1].add(new edge(1, 0, 10));
		graph[1].add(new edge(1, 3, 40));

		graph[2].add(new edge(2, 0, 15));
		graph[2].add(new edge(2, 3, 50));

		graph[3].add(new edge(3, 1, 40));
		graph[3].add(new edge(3, 2, 50));

	}

	static void BelmenFord(ArrayList<edge> graph[], int V, int src) {
		int dist[] = new int[V];
		for (int i = 0; i < V; i++) {
			if (i != src)
				dist[i] = 9999;// MAX VALUE;
		}
		for (int k = 0; k < V - 1; k++) {
			for (int curr = 0; curr < V; curr++) {
				for (int j = 0; j < graph[curr].size(); j++) {
					edge e = graph[curr].get(j);
					int u = e.src;
					int v = e.dest;
					if (dist[u] != 9999 && dist[u] + e.wt < dist[v])
						dist[v] = dist[u] + e.wt;

				}
			}
		}
		boolean neg = false;
//		FOR NEGATIVE WEIGHT CYCLE

		outer: for (int k = 0; k < V - 1; k++) {
			for (int curr = 0; curr < V; curr++) {
				for (int j = 0; j < graph[curr].size(); j++) {
					edge e = graph[curr].get(j);
					int u = e.src;
					int v = e.dest;
					if (dist[u] != 9999 && dist[u] + e.wt < dist[v]) {
						System.out.println("Belman Ford's Algorithm");
						System.err.println("NEGATIVE WEIGHT CYCLE");
						neg = true;
						break outer;
					}

				}
			}
		}
		if (!neg) {
			System.out.println("Belman Ford's Algorithm");
			for (int i = 0; i < V; i++) {
				System.out.print(dist[i] + " ");
			}
			System.out.println();
		}

	}

	static void PrimsAlgo(ArrayList<edge> graph[], int V) {
		PriorityQueue<pair> pq = new PriorityQueue<>();
		boolean vis[] = new boolean[V];
		ArrayList<edge> track = new ArrayList<>();
		pq.add(new pair(0, 0));

		int cost = 0;
		while (!pq.isEmpty()) {
			pair curr = pq.remove();
			if (!vis[curr.node]) {
				vis[curr.node] = true;
				cost += curr.dist;

				for (int i = 0; i < graph[curr.node].size(); i++) {
					edge e = graph[curr.node].get(i);
					if (!vis[e.dest]) {
						pq.add(new pair(e.dest, e.wt));

						// The edge is selected
						int u = curr.node;
						int v = pq.peek().node;
						int weight = pq.peek().dist;
						if (!track.contains(new edge(u, v, weight))) {
							track.add(new edge(u, v, weight));
						}
					}
				}
			}
		}
		System.out.println("PRIMS ALGORITHM");
		System.out.println("Total Cost = " + cost);
		System.out.println("Edges included are");
		for (edge e : track) {
			System.out.println(e.src + "-->" + e.dest + " [" + e.wt + "]");
		}
	}

	static void DijkistrasAlgo(ArrayList<edge> graph[], int src, int V) {
		PriorityQueue<pair> pq = new PriorityQueue<>();
		pq.add(new pair(0, 0));
		int dist[] = new int[V];
		for (int i = 0; i < V; i++) {
			dist[i] = 9999;// MAX VALUE;
		}
		dist[0] = 0;
		boolean vis[] = new boolean[V];
		while (!pq.isEmpty()) {
			pair curr = pq.remove();// smallest
			if (!vis[curr.node]) {
				vis[curr.node] = true;
				for (int i = 0; i < graph[curr.node].size(); i++) {
					edge e = graph[curr.node].get(i);
					int u = e.src;
					int v = e.dest;
					if (dist[curr.node] + e.wt < dist[v]) {
						dist[v] = dist[curr.node] + e.wt;
						pq.add(new pair(v, dist[v]));
					}

				}
			}

		}
		System.out.println("Dijkstra's Algorithm");
		for (int i = 0; i < V; i++) {
			System.out.print(dist[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int v=6;
//		ArrayList<edge>graph[]=new ArrayList[v];
//		create(graph,v); 
//		DijkistrasAlgo(graph, 0, v);
//		023689 
//		int v = 5;
//		ArrayList<edge> graph[] = new ArrayList[v];
//		create(graph, v);
//		BelmenFord(graph, v, 0);
//		Belman Ford's Algorithm
//		0 2 -2 0 4 
		int v = 4;
		ArrayList<edge> graph[] = new ArrayList[v];
		create(graph, v);
		PrimsAlgo(graph, v);
//		PRIMS ALGORITHM
//		Total Cost = 55
	}

}
