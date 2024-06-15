package dayfifteen;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,String> personMap=new TreeMap<String,String>();
		personMap.put("sonje.alpana@gmail.com","Alpana Sonje");
		personMap.put("rothesagar@gmail.com","Sagar Rothe");
		personMap.put("zopetejas@gmail.com","Tejas Zope");
		personMap.put("bhushanhinde@gmail.com","Bhushan Shinde");
		System.out.println(personMap);
		System.out.println("--------------------------------------");
		personMap.put("sonje.alpana@gmail.com","Alpana Deepak Sonje");
		System.out.println(personMap);	
		System.out.println("--------------------------------------");
		personMap.put("asonje.alpana@gmail.com","Alpana Deepak Sonje");
		System.out.println(personMap);
		System.out.println("--------------------------------------");
		personMap.put("onje.alpana@gmail.com",null);
		System.out.println(personMap);
		
		Set<String> emailSet=personMap.keySet();
		System.out.println(emailSet);
		Collection<String> names=personMap.values();
		System.out.println(names);
		System.out.println(personMap.get("asonje.alpana@gmail.com"));
		System.out.println(personMap.get("rothesagar@gmail.com"));
		
		Set<Entry<String,String>> persons=personMap.entrySet();
		Iterator<Entry<String,String>> p=persons.iterator();
		while(p.hasNext()) {
			Map.Entry<String, String> entry=p.next();
			System.out.println(entry);
		}
	}

}
