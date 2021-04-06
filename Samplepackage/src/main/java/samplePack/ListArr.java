package samplePack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListArr {

	public static void main(String[] args) {
		//Array List,Linked List,Queue,Stack
		
	//Implement List
	List<String> animals = new ArrayList<String>();
	animals.add("Cat");
	animals.add("Dog");
	animals.add("Fish");
	animals.add("Fish");//List allowed duplicate values tobe displayed
	System.out.println(animals.toString());
	if(animals.contains("Cat")) {
		System.out.println("Found Cat");
	}
	
	for(int i = 0;i<animals.size();i++) {
		System.out.println(animals.get(i));
		
	}
      animals.add(1,"bugs");
      System.out.println(animals.toString());
      animals.remove(0);
      System.out.println(animals.toString());
      animals.remove("bugs");
      System.out.println(animals.toString());
      
      String[] str = {"orange","apple","mango"};
      List<String>fruits = Arrays.asList(str);
      System.out.println(fruits.toString());
      
      String[] str1= {"Tomoto","Onion"};
      List<String> newList = new ArrayList<String>();
      newList.addAll(fruits);
      newList.addAll(Arrays.asList(str1));
      System.out.println( newList.toString());
      
      Iterator<String> itr = newList.iterator();
      while(itr.hasNext()){
    	  System.out.println(itr.next());
    	  
      }
	}
     

}
