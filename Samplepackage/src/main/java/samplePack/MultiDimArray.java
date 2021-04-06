package samplePack;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
 int[][] arr = new int[4][3];
 //DATATYPE [] ARRAY NAME =NEW 
    arr[0][0] = 3;
    arr[0][1] = 4;
    arr[0][2] =5;
    arr[1][0] =6;
    arr[1][1] = 7;
    for (int i =0; i < 4 ;i++) {
    	
    	for (int j = 0;j < 3 ;j++) {
    		System.out.print(arr[i][j]);
    		System.out.print(" ");
    	}
    	System.out.println();
    }
     
	}

}
