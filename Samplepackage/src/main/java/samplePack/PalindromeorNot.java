package samplePack;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
	
		System.out.println("Enter a string ");// Enter string
	      Scanner sc = new Scanner(System.in);//Initializing scanner to get input from keyboard
	      String s = sc.nextLine();//Storing input from keyboard to string variable
	       String temp = s.toLowerCase();
	      char[] arr1 = temp.toCharArray();// convert string into  character array 
	     int[] arr2 = {2,3,4,5,6};
	   
	      boolean read =  false;
	      //iterate through array 
	      for(int i = 0; i < arr1.length;i++) {
	    	  
	    	if  (arr1[i] == arr1[arr1.length-1-i]) {
	    		
	    		read = true;
	    		continue;
	    		                                                          //MALAYALAM
	    		                                                           //012345678
	    		
	    	}     else {
	    		          
	    		  System.out.println("String is not palindrome");     //its true when first and last letter is same
	    		  
	    		  break;
	    	}
	    	  
	    	  
	      }
	      if(read == true) {
    		  System.out.println("String is palindrome");
    	  } 
	}

}
