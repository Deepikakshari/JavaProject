package samplePack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
	Set<String> hs = new HashSet<String>();
	hs.add("car");
	hs.add("Bike");
	hs.add("bus");
	hs.add("bus");//Hashset not allowed duplicate values to be displayed 
	System.out.println(hs);
	
	Iterator<String> itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
  if(hs.contains("bus")){
	  System.out.println("found bus");//hs set is unsorted
  }
  
  //Treeset
  Set<String>ts = new TreeSet<String>();
  
  ts.add("rose");
  ts.add("jasmine");
  ts.add("sunflower");     //gives sorted list
  System.out.println(ts);
 // Iterator<String> itr1 = ts.iterator();
 // while(itr1.hasNext()) {
	 // System.out.println(ts.next());
 // }
  
	}

}
