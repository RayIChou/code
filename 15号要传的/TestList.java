package test;

import java.awt.List;
import java.util.ArrayList;

public class TestList {
	

static void testList(){
	ArrayList c = new ArrayList();
	c.add("a");
	c.add("b");
	c.add("c");
	//c.add(1,"0");
	c.set(1, "0");
	c.get(2);
	c.remove("c");
	List cc= (List) c.subList(2,4);
	System.out.println(cc);
	
}
public static void main(String[] args){
	testList();
}
}