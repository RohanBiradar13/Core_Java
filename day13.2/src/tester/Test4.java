package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.app.core.Emp;
import com.app.core.TempWorker;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * public static <T> void copy(List<?super T> dest, List<? extends T> src)
		 * Copies all of the elements from one list into another.
		 * T : Emp
		 * src list : Emp or it's sub type
		 * dest list : Emp or it's super type
		 * Using above method, can you copy list(AL/LL/Vector) of temp workers(src) into the list of emps(dest)?
		 */
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
		
		Collections.copy(emps, workers);//what does javac checks? emps n workers : lists? Yes
		//T : Emp
		//src : TempWokers(? extends Emp) => correct & size 3
		//dest : Emp(? super Emp) => Emp or it's super type => correct & size of emps is 4
		//for this method to be work well jvm checks that the size of the src must be smaller than the size of the dest(Emp)
		System.out.println(emps);

	}

}
