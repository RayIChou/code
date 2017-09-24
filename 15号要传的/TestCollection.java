package test;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class TestCollection {
	public static void main(String[] args){
		Collection c = new HashSet(); 
        Collection c2 = new HashSet();
        Apple a = new Apple();
        c2.addAll(c);
        c2.add(c);
        System.out.println(c2.contains(a));
        System.out.println(c2.containsAll(c));
        System.out.println(c.isEmpty());
        //remove(a);
        System.out.println(a);
        c2.retainAll(c);
        System.out.println(c2);
	}
}

class Apple{
	int weight;
	}
