package custom_ordering;

import java.util.Comparator;

import com.app.core.Emp;

public class EmpSalaryComparator implements Comparator<Emp> {
	@Override
	public int compare(Emp e1 ,Emp e2) {
		System.out.println("in compare method..");
		if(e1.getSalaray() < e2.getSalaray())
			return -1;
		if(e1.getSalaray() == e2.getSalaray())
			return 0;
		else
			return 1;
	}

}
