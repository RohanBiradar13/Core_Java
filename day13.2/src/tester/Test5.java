package tester;

import java.util.ArrayList;
import java.util.LinkedList;

import com.app.core.Emp;
import com.app.core.TempWorker;

public class Test5 {

	public static void main(String[] args) {
		//ArrysList API
		//public void addAll(Collection<? extends E coll>)
		LinkedList<TempWorker> workers = new LinkedList<>();
		workers.add(new TempWorker());
		workers.add(new TempWorker());
		workers.add(new TempWorker());
		workers.add(new TempWorker());//list of temp workers : size 4
		
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());
		emps.add(new Emp());//size 5
		
		//append worker list to emp list
		emps.addAll(workers);//javac checks : if LinckedList is a collection : yes
		//TempWorker is a Emp
		
		for(Emp e : emps) {
			System.out.println(e);
		}

	}

}
