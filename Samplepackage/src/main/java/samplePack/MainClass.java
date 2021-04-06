package samplePack;

public class MainClass {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
           int a = 6,b = 0;
		ParentClass p = new ParentClass();
		p.setA(4);
		System.out.println(p.getA());
		
		ChildClass c = new ChildClass();
		System.out.println(c.x);
		
	   c.sum(2,7);
//	   
//	   try {
//	   int Divide =  a/b ;
//	   }
//	   catch(Exception e){
//		   
//		  System.out.println(e.getMessage()); 
//	   }
//	   
	
	   int Divide =  a/b;
	  
	   
	}

}
