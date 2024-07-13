package tester;
import java.util.ArrayList;

import com.app.core.Emp;
import com.app.core.Manager;
public class Test1 {

	public static void main(String[] args) {
		//for creating a populated AL of type E
		//ArrayList(Collection<? extends E> coll)
		//? : un bounded wild card
		//? extends E : E or it's sub type
		ArrayList<Manager> mgrs = new ArrayList<>();
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		mgrs.add(new Manager());
		//mgrs : AL<Manager> : populated list of mgrs
		ArrayList<Emp> emps = new ArrayList<>(mgrs);
		//no compile or run time error bcoz of generic beauty & constructor of AL
		//javac checks mgrs : is it a collection - mgrs data type is AL, AL is a Collecton
		//then checks for generic type : allowed types are ? extends Emp => Emp or it's sub type
		//Above constructor implies that you can create a populated AL of Emp from any 
		//collection(AL/LL/Vector/HS/LHS/TS) except Maps=>(HM/LHM/TM)
		//Any collection(AL/LL/Vector/HS/LHS/TS) of the generic type Emp or it's sub type(Mgr,W,HRM,TempW..)
		
		System.out.println(emps);
		
		

	}

}
