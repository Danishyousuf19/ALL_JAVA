import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Minimize_Lateness_using_earliest_deadline {
	PriorityQueue<task> pq;

	class task implements Comparable<task> {
		int finshtime;
		int deadline;
		char name;

		task(char n, int f, int d) {
			name = n;
			deadline = d;
			finshtime = f;
		}

		@Override
		public int compareTo(task o) {
			// TODO Auto-generated method stub
			return this.deadline - o.deadline;
		}

	}

	void addDetails(char c, int f, int d) {
		task t = new task(c, f, d);
		pq.add(t);
	}

	void MinimizeLateness() {
		int n = pq.size();
		HashMap<task,Integer> res = new HashMap<>();
		int totaltime = 0;
		if (n != 0) {
			for (int i = 0; i < n; i++) {
				task curr = pq.remove();
				totaltime += curr.finshtime;
				int lateness=totaltime-curr.deadline;
				if(lateness<0)lateness=0;
				res.put(curr,lateness);
			}

		}
		for(Map.Entry<task, Integer>entry:res.entrySet())
		{
			System.out.println("Task = " +entry.getKey().name+" "+entry.getKey().finshtime+" "+entry.getKey().deadline+" Maximum Lateness = "+entry.getValue());
		}
		System.out.println("Total Lateness = "+totaltime);
	}

	Minimize_Lateness_using_earliest_deadline() {
		pq = new PriorityQueue<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimize_Lateness_using_earliest_deadline l1=new Minimize_Lateness_using_earliest_deadline();
		l1.addDetails('a', 3,4);
		l1.addDetails('b', 4,8);
		l1.addDetails('c', 7,10);
		l1.addDetails('d', 6,7);
		l1.addDetails('e', 5,15);
		l1.addDetails('f', 1,5);
		
		l1. MinimizeLateness();
	}

}
