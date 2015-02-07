package demo.spring.client;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colores {
	private String colorName;

	public Colores () {}
	
	public Colores(String colorName) {
		super();
		this.colorName = colorName;
	}
	
	
	public static void main(String[] args) {
	  	Colores col1 = new Colores("blue");
    	Colores col2 = new Colores("coffe");
    	Colores col3 = new Colores("yellow");
    	
    	Set set1 = new HashSet();
    	set1.add(col1);
    	set1.add(col2);
    	set1.add(col3);
    	System.out.println("  size: " + set1.size());
    	
    	
    	List<String> strList = new ArrayList<String>();
    	strList.add("Hello");
    	strList.add("World");
    	strList.add("How");
    	strList.add("are");
    	strList.add("you");
    	strList.add("World");
    	//using for-each loop
    	for(String obj : strList){
    	    System.out.println(obj);
    	}
    	//using iterator
    	Iterator<String> it = strList.iterator();
    	while(it.hasNext()){
    	    String obj = it.next();
    	    System.out.println(" hashCode->{"+ it.hashCode() + "}   " +   obj  + "  hashCode ->{"+ obj.hashCode() +"}" );
    	}
    	System.out.println( strList.contains("are"));
    	System.out.println(" positions 0  " + strList.get(0));		
	}
}
