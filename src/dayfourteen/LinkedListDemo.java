package dayfourteen;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cityList=new LinkedList<String>();
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Mumbai");
		System.out.println(cityList);
		System.out.println("----------------------------");
		cityList.add(2,"Delhi");
		System.out.println(cityList);
		System.out.println("-----------------------------");
		cityList.addFirst("Hyderabad");
		cityList.addLast("Chennai");
		System.out.println("-----------------------------");
		System.out.println(cityList);
		System.out.println("-----------------------------");
		System.out.println("FirstCity: "+cityList.getFirst());
		System.out.println("LastCity: "+cityList.getLast());
		System.out.println("City at possition 2: "+cityList.get(2));
		System.out.println("------------------------------");
		System.out.println("Removed city at 2 position: "+cityList.remove(2));
		System.out.println("Removed city at 2 position: "+cityList.removeFirst());
		System.out.println("Removed city at 2 position: "+cityList.removeLast());
		System.out.println(cityList);
		cityList.clear();
		System.out.println("------------------------------");
		System.out.println(cityList);
		System.out.println("Size: "+cityList.size());
		
		
		cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Nagpur");
		cityList.add("Ahmedabad");
		cityList.add("Nasik");
		cityList.add("Pune");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("Chennai");
		System.out.println("------------------------------");
		System.out.println(cityList);
		System.out.println("Size: "+cityList.size());
		
		ListIterator<String> lit=cityList.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next().toUpperCase());
		System.out.println("------------------------------");
		
		lit=cityList.listIterator();
		while(lit.hasNext()) {
			String city=lit.next();
			if(city.equals("Delhi"))
				lit.remove();
			if(city.equals("Nasik"))
				lit.set("Nashik");
			if(city.equals("Nagpur"))
				lit.add("Jaipur");
		}
		System.out.println(cityList);
		System.out.println("------------------------------");
		lit=cityList.listIterator(cityList.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("------------------------------");	
	}
}
