package Rectangle;
import java.util.Scanner;
public class RectangleArea {
	private int length;
	private int breadth;
	public RectangleArea() {
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l,b;
		l=sc.nextInt();
		b=sc.nextInt();
		this.length = l;
		this.breadth = b;
		sc.close();
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getbreadth() {
		return breadth;
	}
	public void setbreadth(int breadth) {
		this.breadth = breadth;
	}
	int area(int length,int breadth) {
		return length*breadth;
	}
}
