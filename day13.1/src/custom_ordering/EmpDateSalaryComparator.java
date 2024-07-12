package custom_ordering;

import java.util.Comparator;

import com.app.core.Emp;

public class EmpDateSalaryComparator implements Comparator<Emp>{
	
	@Override
	public int compare(Emp e1, Emp e2) {
		
		int returnValue = e1.getJoinDate().compareTo(e2.getJoinDate());
		if(returnValue == 0) {
			return ((Double)e1.getSalaray()).compareTo(e2.getSalaray());
			/*
			 * if(e1.getSalaray() < e2.getSalaray()) return -1; if(e1.getSalaray() ==
			 * e2.getSalaray()) return 0; return 1;
			 */
		}
		return returnValue;
		/*
		 * if(e1.getJoinDate().before(e2.getJoinDate()) ) return -1;
		 * if(e1.getJoinDate().after(e2.getJoinDate())) return 1;
		 * 
		 * return 0;
		 */
	}

}
