package test;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



@SuppressWarnings("unchecked")
public class TestCollection {
	public static void main(String[] args){
		testMap(); 
		testMap2();
	/*	Collection c = new HashSet(); 
        Collectio7n c2 = new HashSet();
        Apple a = new Apple();
        c2.addAll(c);
        c2.add(c);
        System.out.println(c2.contains(a));
        System.out.println(c2.containsAll(c));
        System.out.println(c.isEmpty());
        //remove(a);
        System.out.println(a);
        c2.retainAll(c);
        System.out.println(c2);*/
	}
	static void testMap(){
		Map m= new HashMap();
		Dog d1 = new Dog(9,"white");
		Dog d2 = new Dog(10,"black");
		m.put("aa", d1);
		m.put("bb", d2);
		Dog d3 = (Dog) m.get("aa");
		System.out.println(d3==d2);
	}
	static void testMap2(){
		Map m = new  HashMap();
		m.put("name", "mike");
		m.put("age", "12");
		m.put("weight","50");
		m.put("address","beijing");
		
		Map m2 = new HashMap();
		m2.put("name", "jorker");
		m2.put("age","10");
		m2.put("weight", "45");
		m2.put("address", "shanghai");
		
		ArrayList list = new ArrayList();
		list.add(m);
		list.add(m2);
		System.out.println(m.get("name"));
		System.out.println(m2.get("address"));
	}
	static void testGeneric(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("sdsdfssdfs");
		list.add("sdasfdsasa");
		
		 String str = list.get(1);
		 Set<Dog> set = new HashSet<Dog>();
		 set.add(new Dog(23,"»ÒÉ«"));
		 
		 Map<String ,Dog> map = new HashMap<String,Dog>();
         map.put("sss", new Dog(22,"black"));
         Dog d = map.get("sss");
	}
}

//class Apple{
	//int weight;
	//}

class Dog{
	int weight;
    public Dog(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	String color;
}
