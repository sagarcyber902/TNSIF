package dayfifteen;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> courseSet=new TreeSet<String>();
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("React");
		courseSet.add("Angular");
		
		System.out.println(courseSet);
		System.out.println("First Course:"+courseSet.first());
		System.out.println("Last Course:"+courseSet.last());
		
		courseSet.remove("C");
		System.out.println(courseSet);
		
		courseSet.pollFirst();
		System.out.println(courseSet);
		
		courseSet.pollLast();
		System.out.println(courseSet);
		
		
		Comparator<Employee> comp=(e1,e2)->(int)(e1.getEmpId()-e2.getEmpId());
		TreeSet<Employee> empSet=new TreeSet<Employee>(comp);
		empSet.add(new Employee(101,"Prathamesh",73000));
		empSet.add(new Employee(104,"Sharad",62000));
		empSet.add(new Employee(102,"Ram",81000));
		empSet.add(new Employee(106,"Ankita",78000));
		empSet.add(new Employee(103,"Nandini",63000));
		
		System.out.println("Employee Details:\n"+empSet);
		
		
		
	}

}
