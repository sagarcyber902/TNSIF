package dayfifteen;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashDemo {
	public static void main(String[]args) {
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		lhs1.add(60);
		lhs1.add(30);
		lhs1.add(90);
		lhs1.add(20);
		lhs1.add(70);
		lhs1.add(40);
		lhs1.add(40);
		
		System.out.println(lhs1);
		Iterator<Integer> it=lhs1.iterator();
		while(it.hasNext())
				System.out.println(it.next()+"\t");
		
		System.out.println("Size :"+lhs1.size());
		lhs1.remove(30);
		lhs1.remove(50);
		System.out.println(lhs1);
		
		ArrayList<Integer> a=new ArrayList<Integer>(lhs1);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("After Sorting:"+a);
		lhs1=new LinkedHashSet<Integer>(a);
		System.out.println(lhs1);
		
		
		
		
		
		
		
	}

}
