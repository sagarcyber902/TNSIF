package dayfourteen;

import java.util.Comparator;

public class SortByEmployeeSalary implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getSalary()-o2.getSalary());
	}
}
