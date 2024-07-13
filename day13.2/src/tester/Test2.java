package tester;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.app.core.Emp;
import com.app.core.Manager;
import com.app.core.TempWorker;
public class Test2 {

	public static void main(String[] args) {
		//for creating a populated AL of type E
		//ArrayList(Collection<? extends E> coll)
		//? : un bounded wild card
		//? extends E : E or it's sub type
		HashSet<Manager> mgrs = new HashSet<>();
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		//mgrs : AL<Manager> : populated list of mgrs
		ArrayList<Emp> emps = new ArrayList<>(mgrs);
		
		TreeSet<TempWorker> tempWokers = new TreeSet<>();
		tempWokers.add(new TempWorker());
		tempWokers.add(new TempWorker());
		tempWokers.add(new TempWorker());
		tempWokers.add(new TempWorker());
		
		ArrayList<Emp> emps2 = new ArrayList<>(tempWokers);
		
		//Vector<HRM>(Collection<? extends HRM> C)
		//Vector<HRManager> hrMgrs = new Vector<>(mgrs);
		//above code gives us error coz mgrs is of HashSet is a collection 
		//but HRManager extends mgrs(Manager)=> No HRManager is not a Manager
		
		//Vector<HRManager> hrMgrs = new Vector<HRManager>(tempWokers);
		//since TempWorker is not a manger
		
		
		
		

	}

}
