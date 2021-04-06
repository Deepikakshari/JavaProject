package samplePack;

public class ChildClass implements ParentInterface,ParenInterface2 {
	
	int x =7;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int y;
   
	public void sum(int f,int g) {
	    int sum = f + g ;
		System.out.println("Print Sum:" + sum);
	}
	public void subtract() {
		System.out.println("Print Diff:");
	}
}
