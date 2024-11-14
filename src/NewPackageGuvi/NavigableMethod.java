package NewPackageGuvi;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> nmap = new TreeMap<Integer, String>();
		
		nmap.put(001, "Yukan");
		nmap.put(002, "Sugan");
		nmap.put(003, "Vino");
		nmap.put(004, "Priya");
		
		
		System.out.println("Decending Map" + nmap.descendingMap());
		
		// Treemap maintains ascending order only
		//Hashmap Maintains No order
		

	}

}
