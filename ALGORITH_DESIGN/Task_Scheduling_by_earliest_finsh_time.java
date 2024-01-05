import java.util.ArrayList;
import java.util.PriorityQueue;

public class Task_Scheduling_by_earliest_finsh_time {
	PriorityQueue<task> pq;

	Task_Scheduling_by_earliest_finsh_time() {
		pq = new PriorityQueue<>();
	}

	class task implements Comparable<task> {
		int start;
		int finsh;
		char name;

		task(char n, int s, int f) {
			name = n;
			start = s;
			finsh = f;
		}

		@Override
		public int compareTo(task o) {
			// TODO Auto-generated method stub
			return this.finsh - o.finsh;
		}

	}

	void addTaskDetails(char n, int s, int f) {
		 if (s <= f) {
		        task x = new task(n, s, f);
		        pq.add(x);
		    } else {
		        System.out.println("Start time must be less than or equal to finish time for task " + n);
		    }
	}

	void  TaskSchedular() {
		
		int n = pq.size();
		ArrayList<task> res = new ArrayList<>();
		if (!pq.isEmpty()) {
			task prev=pq.poll();
			res.add(prev);
		for (int i = 1; i < n; i++) {
//			if(task j is compatable with res add else delete all imcopatable 
			task curr=pq.poll();
			if(curr.start>=prev.finsh) {
				res.add(curr);
				prev=curr;
			}

		}}
		for(int i=0;i<res.size();i++) {
			task c=res.get(i);
			System.out.print(c.name+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_Scheduling_by_earliest_finsh_time l1=new Task_Scheduling_by_earliest_finsh_time();
		l1.addTaskDetails('a', 8,13);
		l1.addTaskDetails('b', 2,4);
		l1.addTaskDetails('c', 5,7);
		l1.addTaskDetails('d', 8,12);
		l1.addTaskDetails('e', 4,14);
		
		l1.TaskSchedular();
		
	}

}
