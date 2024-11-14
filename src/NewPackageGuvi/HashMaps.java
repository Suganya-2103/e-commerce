package NewPackageGuvi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer,String> hmap = new HashMap <Integer,String> (); //creating the object
//		
//		hmap.put(1, "Mango"); //putting elements in the hashmap
//		hmap.put(2, "Banana");
//		hmap.put(3, "Grapes");
//		hmap.put(4, "Jackfruit"); //each item in the hashmap is called as entry
//		
//		for(Map.Entry <Integer,String> m:hmap.entrySet()) {             //whenever use for loop method use Map.Entry
//		System.out.println(m.getKey() + " " + m.getValue());
		
		//if we wants to maintain a order user link hash map
		// hash map does not maitain any order like sorting, ascending but maintain insertion order if we dnt want to maintain
		// insertion order means we can user linkedhash map method
//		
//			LinkedHashMap<Integer,String> hmap = new LinkedHashMap <Integer,String> ();
//		
//		hmap.put(3, "Mango"); //putting elements in the hashmap
//		hmap.put(4, "Banana");
//		hmap.put(2, "Grapes");
//		hmap.put(1, "Jackfruit");
//		
//		for(Map.Entry <Integer,String> m:hmap.entrySet()) {             //whenever use for loop method use Map.Entry
//			System.out.println(m.getKey() + " " + m.getValue());
//			
			
			
			//Each key should be unique if we use duplicate means below will be happen
		
		HashMap<Integer,String> hmap = new HashMap <Integer,String> (); //creating the object
		
		hmap.put(1, "Mango"); //putting elements in the hashmap
		hmap.put(2, "Banana");
		hmap.put(3, "Grapes");
		hmap.put(4, "Jackfruit"); //each item in the hashmap is called as entry
		hmap.put(5, "Amla");
//		for(Map.Entry <Integer,String> m:hmap.entrySet()) {             //whenever use for loop method use Map.Entry
//		System.out.println(m.getKey() + " " + m.getValue());
		//if you trying to insert the duplicate key it will replace the element of the corresponding key	
		//will replace grapes as 1 
		
		HashMap<Integer, String> hmap2=new HashMap<Integer, String>();
		hmap.put(6, "Kiwi");
		hmap2.putAll(hmap);
		
//		System.out.println("After putAll()method");
//		for(Map.Entry<Integer, String> m:hmap2.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
			
			
			
			//We can remove item from the hmap
			//1. Key based removal
			//Value based removal - value based removal is not possible
			
//			hmap2.remove(6);
//			
//			System.out.println("After remove ()method");
//			for(Map.Entry<Integer, String> m:hmap2.entrySet()) {
//				System.out.println(m.getKey() + " " + m.getValue());
			
		
		//We can replace the value
		
//		hmap.replace(2, "Strawberry");
		hmap.replace(2, "Banana", "Strawberry");
		
		for(Map.Entry<Integer, String> m:hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		
		
		}
		
		
		
		
			
		}
		

	}



