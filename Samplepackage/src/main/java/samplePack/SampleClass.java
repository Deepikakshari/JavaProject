package samplePack;

public class SampleClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Array declaration and initializing values 
		int [] arry= {2,3,5};
		//Array declaration with size
		int [] array2 = new int[2];
		String [] animals = new String[3];
		animals[0] = "cat";
		animals[1] = "dog";
		animals[2] = "ox";
		for(int i = 0;i<animals.length;i++) {
			System.out.println(animals[i]);
			
		}
	   int[] arr2 = {4,5,6,23,41,11,15,21,38,25};
	   int sum = 0;
	   float avg;
	   for(int i =0;i<arr2.length;i++) {
		   
		   sum = sum + arr2[i];
		  
	   }
	   System.out.println(sum); 
	   avg = (float)sum/(float)arr2.length;
	   System.out.println(avg);
	}
		
   
}
