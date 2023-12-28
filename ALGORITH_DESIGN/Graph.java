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
		graph[0].add(new edge(0, 2));
		graph[1].add(new edge(1, 2));
		graph[1].add(new edge(1, 3));
		graph[2].add(new edge(2, 0));
		graph[2].add(new edge(2, 1));
		graph[2].add(new edge(2, 3));
		graph[3].add(new edge(3, 1));
		graph[3].add(new edge(3, 2));
	}
	static void bfs(ArrayList<edge>graph[],int v) {
		boolean vis[]=new boolean[v];
		Queue<Integer>q=new LinkedList<>();
		q.add(0);
		while(!q.isEmpty()) {
			int curr=q.poll();
			if(vis[curr]==false) {
				vis[curr]=true;
				System.out.print(curr+" ");
				for(int i=0;i<graph[curr].size();i++) {
					edge e=graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int v=4;
ArrayList<edge>graph[]=new ArrayList[v];
create(graph);
bfs(graph,4);

	}

}
