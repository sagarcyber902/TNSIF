package dayseventeen;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		/*System.out.println("-----------in main---------------");
		System.out.println(Thread.currentThread().getName());
		Runnable r=()->{
			for(int i=1;i<50;i++) {
				System.out.println(Thread.currentThread().getName()+"Hello");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
			}
		};
		
		Thread t1=new Thread(r,"Thread1");
		Thread t2=new Thread(r,"Thread2");
		t1.start();
		t2.start();
		*/
	
				ArrayList<Integer> numList =  new ArrayList<Integer>();
				numList.add(40);
				numList.add(50);
				numList.add(60);
				numList.add(70);
				numList.add(80);
				numList.add(90);
				numList.add(30);
				numList.add(20);
				numList.add(10);
				
				
				System.out.println("--------Before Sorting---------");
				System.out.println(numList);
				Collections.sort(numList);
				System.out.println("\n--------After SOrting----------");
				System.out.println(numList);
				System.out.println("---------------------------------");
				
				Comparator<Integer> comp = (n1,n2) -> n2-n1;
				Collections.sort(numList,comp);
				System.out.println("\n Descending Order");
				System.out.println(numList);
				
				System.out.println("---------------------------------");

				
				ArrayList<String> nameList =  new ArrayList<String>();
				nameList.add("Aditya");
				nameList.add("Arpan");
				nameList.add("Tejas");
				nameList.add("Tanya");
				nameList.add("Bhadne");
				nameList.add("Yash");
				nameList.add("Pranav");
				
				System.out.println("\n Name List");
				System.out.println(nameList);
				Collections.sort(nameList);
				System.out.println("\nAfter Sorting");
				System.out.println(nameList);
				
				Comparator<String> strComp = (s1,s2) ->  s2.compareTo(s1);
				
				Collections.sort(nameList , strComp);
				System.out.println("\nDescending order");
				System.out.println(nameList);
				
				
				ArrayList<Student> studList = new ArrayList<Student>();
				studList.add(new  Student(10,"Aditya", 89,"IT"));
				studList.add(new  Student(21,"Arpan", 90,"comp"));
				studList.add(new  Student(40,"tanya", 80,"mech"));
				studList.add(new  Student(69,"sagar", 96,"aids"));
				studList.add(new  Student(7,"Thala", 100,"cricket"));
				
				System.out.println(studList);
				
				
				Comparator<Student> studcomp = (s1,s2) ->  s2.getStream().compareTo(s1.getStream());
				
				Collections.sort(studList , studcomp);
				System.out.println("---------------------------------");

			
				System.out.println(studList);
				
				
				
		
		
	}

}
